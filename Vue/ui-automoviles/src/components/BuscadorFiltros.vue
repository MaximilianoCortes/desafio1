<template>
    <div>
      <h2>Buscador y Filtros</h2>
      <!-- Agrega los campos de búsqueda y filtros según tus necesidades -->
    </div>
  </template>
  
  <script>
  import axios from "axios";
  
  export default {
    methods: {
      buscar() {
        // Realiza la llamada a la API para buscar automóviles según los filtros seleccionados
        // Puedes utilizar axios para enviar una solicitud GET al endpoint correspondiente en el backend
        axios
          .get(`${process.env.VUE_APP_API_URL}/automoviles`)
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