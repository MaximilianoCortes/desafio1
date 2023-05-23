<template>
  <div>
    <form @submit.prevent="submitForm">
      <input type="number" v-model="precio" placeholder="Escribe la cantidad">
      <button type="submit">Aplicar filtro</button>
      <button @click="quitarFiltro">Quitar filtro</button>
    </form>

    <div v-if="filtroAplicado">
      <p>Filtro aplicado</p>
    </div>
    <div v-else>
      <p>No se ha aplicado ningún filtro.</p>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      cantidad: 0,
      automovil: null,
      filtroAplicado: false,
      localStorageKey: 'filtroPrecio', // Clave para almacenar en localStorage
    };
  },
  mounted() {
    this.checkFiltroAplicado(); // Verificar el estado del filtro al cargar el componente
  },
  methods: {
    generate() {
      axios.get(`http://localhost:8080/api/filtrar?precio=${this.precio}`)
        .then(response => {
          this.automovil = response.data;
          this.setFiltroAplicado(true); // Marcar que se ha aplicado el filtro
          window.location.reload(); // Recargar la página
        })
        .catch(error => {
          console.error(error);
        });
    },
    submitForm() {
      this.generate();
    },
    quitarFiltro() {
      this.setFiltroAplicado(false); // Marcar que se ha quitado el filtro
      this.precio = 30000000; // Restablecer el valor del precio
      window.location.reload(); // Recargar la página
    },
    setFiltroAplicado(value) {
      this.filtroAplicado = value; // Actualizar el estado del filtro en el componente
      localStorage.setItem(this.localStorageKey, value); // Almacenar el estado del filtro en localStorage
    },
    checkFiltroAplicado() {
      const filtroAplicado = localStorage.getItem(this.localStorageKey); // Obtener el estado del filtro de localStorage
      this.filtroAplicado = filtroAplicado === 'true'; // Convertir el valor a booleano y asignarlo al estado del filtro en el componente
    },
  },
};
</script>