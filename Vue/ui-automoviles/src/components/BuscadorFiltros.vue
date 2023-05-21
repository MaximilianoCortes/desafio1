<template>
    <div>
      <h2>Buscador y Filtros</h2>
      <form @submit.prevent="buscarAutomoviles">
        <label>Marca:</label>
        <input type="text" v-model="marca">
        <!-- Otros campos de filtro -->
        <button type="submit">Buscar</button>
      </form>
    </div>
  </template>
  
  <script>
export default {
  data() {
    return {
      marca: '',
      // Otros campos de filtro
      automovilesFiltrados: [], // Variable para almacenar los automóviles filtrados
    };
  },
  methods: {
    buscarAutomoviles() {
      // Realizar la llamada a la API con los filtros indicados
      const params = new URLSearchParams();
      params.append('marca', this.marca);
      // Agrega otros campos de filtro a los parámetros

      fetch(`http://localhost:8080/automoviles?${params.toString()}`)
        .then(response => response.json())
        .then(data => {
          this.automovilesFiltrados = data; // Almacena los automóviles filtrados en la variable
        })
        .catch(error => {
          console.error('Error al buscar los automóviles:', error);
        });
    },
    limpiarFiltros() {
      this.marca = '';
      // Restablece los otros campos de filtro a su valor predeterminado
      this.automovilesFiltrados = []; // Limpia la lista de automóviles filtrados
    },
  },
};
</script>