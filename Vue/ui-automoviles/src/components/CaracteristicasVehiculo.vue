<template>
    <div>
      <h2>Características del Vehículo</h2>
      <div v-if="vehiculoSeleccionado">
        <h3>{{ vehiculoSeleccionado.marca }}</h3>
        <!-- Mostrar otras características del vehículo -->
      </div>
      <div v-else>
        <p>Selecciona un vehículo para ver sus características.</p>
      </div>
    </div>
  </template>
  
  <script>
export default {
  data() {
    return {
      vehiculoSeleccionado: null,
    };
  },
  methods: {
    mostrarCaracteristicas(vehiculo) {
      this.vehiculoSeleccionado = vehiculo;
    },
    limpiarSeleccion() {
      this.vehiculoSeleccionado = null;
    },
  },
};
</script>