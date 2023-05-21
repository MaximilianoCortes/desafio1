<template>
  <div>
    <h1>Automóviles</h1>

    <GenerarAutomoviles />

    <hr>

    <BuscadorFiltros />

    <hr>

    <CaracteristicasVehiculo v-if="vehiculoSeleccionado" :vehiculo="vehiculoSeleccionado" @limpiarSeleccion="limpiarSeleccion" />

    <div v-else>
      <p>Selecciona un vehículo para ver sus características.</p>
    </div>
  </div>
</template>

<script>
import GenerarAutomoviles from "@/components/GenerarAutomoviles";
import BuscadorFiltros from "@/components/BuscadorFiltros";
import CaracteristicasVehiculo from "@/components/CaracteristicasVehiculo";

export default {
  components: {
    GenerarAutomoviles,
    BuscadorFiltros,
    CaracteristicasVehiculo,
  },
  data() {
    return {
      vehiculoSeleccionado: null,
    };
  },
  methods: {
    mostrarCaracteristicas(vehiculo) {
      this.vehiculoSeleccionado = vehiculo;
    },
    limpiarSeleccion() {
      this.vehiculoSeleccionado = null;
    },
  },
};
</script>