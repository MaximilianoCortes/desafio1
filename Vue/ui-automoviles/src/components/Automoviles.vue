<template>
    <div class="container" ref="containerRef">
              <!-- Componente DetalleAutomovil -->
      <CaracteristicasVehiculo :automovil="automovilSeleccionado" v-if="mostrarDetalleAutomovil" />
      <h1 class="text-center">Lista de automóviles</h1>
      <table class="table table-striped">
        <!-- Encabezados de la tabla -->
        <thead>
          <th>Id</th>
          <th>Marca</th>
          <th>Año</th>
          <th>Color</th>
          <th>Precio</th>
        </thead>
        <!-- Cuerpo de la tabla -->
        <tbody>
          <tr v-for="automovil in automoviles" :key="automovil.id" @click="mostrarDetalle(automovil)">
            <td>{{ automovil.id }}</td>
            <td>{{ automovil.marca }}</td>
            <td>{{ automovil.ano }}</td>
            <td>{{ automovil.color }}</td>
            <td>{{ automovil.precio }}</td>
          </tr>
        </tbody>
      </table>
  

  
    </div>
  </template>
  
  <script>
  import CaracteristicasVehiculo from './CaracteristicasVehiculo.vue';
  import axios from 'axios';
  
  export default {
    name: 'ListaAutomoviles',
    components: {
    CaracteristicasVehiculo
},
    data() {
      return {
        automoviles: [],
        automovilSeleccionado: null,
        mostrarDetalleAutomovil: false
      };
    },
    mounted() {
      axios
        .get('http://localhost:8080/api/automoviles')
        .then(result => (this.automoviles = result.data));
    },
    methods: {
      mostrarDetalle(automovil) {
        this.automovilSeleccionado = automovil;
        this.mostrarDetalleAutomovil = true;
        this.$refs.containerRef.scrollIntoView({ behavior: 'smooth' });
      }
    }
  };
  </script>