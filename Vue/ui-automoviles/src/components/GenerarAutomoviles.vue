<template>
  <div>
    <h2>Generar Automóviles</h2>
    <label>Cantidad:</label>
    <input type="number" v-model="cantidad" min="1" />
    <button @click="generarAutomoviles">Generar</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      cantidad: 1,
    };
  },
  methods: {
    generarAutomoviles() {
      axios
        .post(`${process.env.VUE_APP_API_URL}/automoviles/generar`, {
          cantidad: this.cantidad,
        })
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
};
</script>