<!-- <template>
    <div>
      <h2>Buscador de Automóviles</h2>
      <div class="filtro">
        <label>Cantidad de automóviles: </label>
        <input type="number" v-model="cantidadAutomoviles" min="1">
        <button @click="buscar">Buscar</button>
      </div>
      <div class="resultado">
        <h3>Resultado de la búsqueda:</h3>
        <ul>
          <li v-for="automovil in automoviles" :key="automovil.id">
            <span>{{ automovil.marca }}</span> - <span>{{ automovil.modelo }}</span>
          </li>
        </ul>
      </div>
    </div>
  </template>
  
  <script>
  import axios from "axios";

  export default {
    data() {
      return {
        cantidadAutomoviles: 2,
        automoviles: []
      };
    },
    methods: {
        buscar() {
    const cantidad = this.cantidadAutomoviles;
    axios.get(`/automoviles?cantidad=${cantidad}`)
      .then(response => {
        this.automoviles = response.data;
      })
      .catch(error => {
        console.error(error);
      });
  }
    }
  };
  </script>
  
  <style scoped>
  .filtro {
    margin-bottom: 20px;
  }
  
  .resultado {
    margin-top: 20px;
  }
  </style> -->