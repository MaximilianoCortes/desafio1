<template>
  <div>
      <form @submit.prevent="submitForm">
        <input type="number" v-model="cantidad" placeholder="Escribe la cantidad">
        <button type="submit">Generar</button>
      </form>
    </div>
</template>
<script>
import axios from 'axios';
  
export default {
  data(){
    return{
      cantidad: 0,
      automovil: null,
    };
  },
  methods:{
    generar(){
      axios.get(`http://localhost:8080/api/generar?cantidad=${this.cantidad}`)
        .then(response => {
          this.automovil = response.data;
          window.location.reload(); // Recargar la página
        })
        .catch(error => {
          console.error(error);
        });
    },
    submitForm(){
      this.generar();
    }
  }
}
</script>

