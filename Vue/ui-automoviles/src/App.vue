<template>
  <div id="app">
    <GenerarAutomoviles />
    <ListaAutomoviles />
  </div>
</template>

<script>
import ListaAutomoviles from './components/Automoviles.vue';
import GenerarAutomoviles from './components/GenerarAutomoviles.vue';

export default {
  name:'App',
  components: {
    ListaAutomoviles,
    GenerarAutomoviles

  },
};
</script>