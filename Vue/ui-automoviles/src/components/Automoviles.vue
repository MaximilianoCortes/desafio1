<template>
<div class = "container">  
    <h1 class = "text-center">Lista de automoviles</h1>
    <table class="table table-striped">
        <thead>
            <th>Id</th>
            <th>Marca</th>
            <th>Año</th>
            <th>Color</th>
            <th>Precio</th>
            <th>Turbo</th>
            <th>Tipo </th>
            <th>Motor </th>
            <th>Cabinas</th>
            <th>Sunroof</th>
            <th>Popularidad</th>
        </thead>
        <tbody>
            <tr v-for = "automovil in automoviles" v-bind:key = "automovil.id">
                <td>{{ automovil.id }}</td>
                <td>{{ automovil.marca }}</td>
                <td>{{ automovil.año }}</td>
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
</template>

<script>
// import {getAutomovil} from '../AutomovilService'
import axios from "axios";

    

export default{
    name:'ListaAutomoviles',
    data(){
        return{
            automoviles:[]
        }
        
    },
    mounted(){
        axios
            .get("http://localhost:8080/api/automoviles") //aqui poner la direccion nomas de los getmapping de springboot
            .then(result => (this.automoviles = result.data))
    }
}


</script>