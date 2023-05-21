<template>
  <div>
    <h2>Generar Automóviles</h2>
    <form @submit.prevent="generarAutomoviles">
      <label>Cantidad:</label>
      <input type="number" v-model="cantidad" required>
      <button type="submit">Generar</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cantidad: 0,
      automovilesGenerados: [], // Variable para almacenar los automóviles generados
    };
  },
  methods: {
    generarAutomoviles() {
      // Realizar la llamada a la API con la cantidad indicada
      fetch(`http://localhost:8080/automoviles/generar?cantidad=${this.cantidad}`)
        .then(response => response.json())
        .then(data => {
          this.automovilesGenerados = data; // Almacenar los automóviles generados en la variable
        })
        .catch(error => {
          console.error('Error al generar los automóviles:', error);
        });
    },
  },
};
</script>