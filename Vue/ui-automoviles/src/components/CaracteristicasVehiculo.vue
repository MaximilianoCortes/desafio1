<template>
    <div>
      <h2>Características del Vehículo</h2>
      <div v-if="vehiculo">
        <h3>{{ vehiculo.marca }}</h3>
        <p>Año: {{ vehiculo.anio }}</p>
        <p>Color: {{ vehiculo.color }}</p>
        <!-- Agrega las demás características del vehículo según tu modelo de datos -->
      </div>
      <button @click="limpiarSeleccion">Limpiar Selección</button>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      vehiculo: {
        type: Object,
        required: true,
      },
    },
    methods: {
      limpiarSeleccion() {
        this.$emit("limpiarSeleccion");
      },
    },
  };
  </script>