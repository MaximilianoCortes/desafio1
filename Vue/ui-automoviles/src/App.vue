<template>
  <div id="app">
    <GenerarAutomoviles />
    <BuscadorFiltros />
    <ListaAutomoviles />
  </div>
</template>

<script>
import ListaAutomoviles from './components/Automoviles.vue';
import BuscadorFiltros from './components/BuscadorFiltros.vue';
import GenerarAutomoviles from './components/GenerarAutomoviles.vue';

export default {
  name:'App',
  components: {
    ListaAutomoviles,
    GenerarAutomoviles,
    BuscadorFiltros
},
};
</script>