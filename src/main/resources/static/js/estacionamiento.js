document.addEventListener('DOMContentLoaded', () => {
    const parkingLotsBody = document.getElementById('parking-lots-body');
  
    // Datos simulados provenientes de la base de datos
    const parkingLots = [
      { nombreEstacionamiento: 'Estacionamiento A', direccion: 'Calle 123', capacidad: 50, horario: 'Día', disponible: false },
      { nombreEstacionamiento: 'Estacionamiento B', direccion: 'Avenida XYZ', capacidad: 30, horario: 'Noche', disponible: true },
      { nombreEstacionamiento: 'Estacionamiento C', direccion: 'Carrera 456', capacidad: 100, horario: 'Noche', disponible: false },
      { nombreEstacionamiento: 'Estacionamiento D', direccion: 'Calle 789', capacidad: 20, horario: 'Día', disponible: true }
    ];
  
    parkingLots.forEach(lot => {
      agregarFilaTabla(lot);
    });
  });
  
  function agregarFilaTabla(lot) {
    const parkingLotsBody = document.getElementById('parking-lots-body');
    const row = document.createElement('tr');
  
    row.innerHTML = `
      <td>${lot.nombreEstacionamiento}</td>
      <td>${lot.direccion}</td>
      <td>${lot.capacidad}</td>
      <td>${lot.horario}</td>
      <td><button class="btn ${lot.disponible ? 'btn-disponible' : 'btn-no-disponible'}" onclick="toggleDisponibilidad(this)">${lot.disponible ? 'Libre' : 'Ocupado'}</button></td>
    `;
  
    parkingLotsBody.appendChild(row);
  }
  
  function registrarNuevo() {
    const nombreEstacionamiento = document.getElementById('nombre-estacionamiento').value;
    const direccion = document.getElementById('direccion').value;
    const capacidad = document.getElementById('capacidad').value;
    const horario = document.getElementById('horario-funcionamiento').value;
  
    if (nombreEstacionamiento && direccion && capacidad && horario) {
      const nuevoEstacionamiento = {
        nombreEstacionamiento,
        direccion,
        capacidad,
        horario,
        disponible: true // por defecto se agrega como disponible
      };
      agregarFilaTabla(nuevoEstacionamiento);
      limpiarCampos();
    } else {
      alert('Por favor, completa todos los campos con valores válidos.');
    }
  }
  
  function limpiarCampos() {
    document.getElementById('nombre-estacionamiento').value = '';
    document.getElementById('direccion').value = '';
    document.getElementById('capacidad').value = '';
    document.getElementById('horario-funcionamiento').value = '';
  }
  
  function toggleDisponibilidad(button) {
    if (button.classList.contains('btn-disponible')) {
      button.classList.remove('btn-disponible');
      button.classList.add('btn-no-disponible');
      button.textContent = 'Ocupado';
    } else {
      button.classList.remove('btn-no-disponible');
      button.classList.add('btn-disponible');
      button.textContent = 'Libre';
    }
  }
  