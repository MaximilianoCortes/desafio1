<template>
  <div>
    <h2>Generar Automóviles</h2>
    <label>Cantidad:</label>
    <input type="number" v-model="cantidad" min="1" />
    <button @click="generarAutomoviles">Generar</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      automoviles: [],
    };
  },
  methods: {
    generarAutomoviles() {
      const cantidad = 10; // Cantidad de automóviles a generar

      axios.post('/automoviles/generar', { cantidad })
        .then(response => {
          this.automoviles = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
};
</script>