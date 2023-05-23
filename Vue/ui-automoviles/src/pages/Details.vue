<template>
    <div v-if="automovil">
      <h2>Detalles del automóvil</h2>
      <div>
        <p>Id: {{ automovil.id }}</p>
        <p>Marca: {{ automovil.marca }}</p>
        <p>Año: {{ automovil.ano }}</p>
        <p>Color: {{ automovil.color }}</p>
        <p>Precio: {{ automovil.precio }}</p>
        <p>Turbo: {{ automovil.turbo }}</p>
        <p>Tipo: {{ automovil.tipo }}</p>
        <p>Motor: {{ automovil.motor }}</p>
        <p>Cabinas: {{ automovil.cabinas }}</p>
        <p>Sunroof: {{ automovil.sunroof }}</p>
        <p>Popularidad: {{ automovil.popularidad }}</p>
      </div>
    </div>
    <div v-else>
      <p>No se ha seleccionado ningún automóvil.</p>
    </div>
  </template>
  
  <script>
  export default {
    name: 'DetalleAutomovil',
    props: ['automovil']
  };
  </script>