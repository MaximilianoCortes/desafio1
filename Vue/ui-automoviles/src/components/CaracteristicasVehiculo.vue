<template>
  <div v-if="automovil">
    <h2>Detalles del automóvil</h2>
    <div>
      <table class="table table-striped">
        <!-- Encabezados de la tabla -->
        <thead>
          <th>Id</th>
          <th>Marca</th>
          <th>Año</th>
          <th>Color</th>
          <th>Precio</th>
          <th>Turbo</th>
          <th>Tipo</th>
          <th>Motor</th>
          <th>Cabinas</th>
          <th>Sunroof</th>
          <th>Popularidad</th>
        </thead>
        <!-- Cuerpo de la tabla -->
        <tbody>
          <tr v-if="automovil">
            <td>{{ automovil.id }}</td>
            <td>{{ automovil.marca }}</td>
            <td>{{ automovil.ano }}</td>
            <td>{{ automovil.color }}</td>
            <td>{{ automovil.precio }}</td>
            <td>{{ automovil.turbo }}</td>
            <td>{{ automovil.tipo }}</td>
            <td>{{ automovil.motor }}</td>
            <td>{{ automovil.cabinas }}</td>
            <td>{{ automovil.sunroof }}</td>
            <td>{{ automovil.popularidad }}</td>
          </tr>
        </tbody>
      </table>
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
