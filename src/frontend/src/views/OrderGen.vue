<!-- Initial loading from template -->

<!-- Editable section with interesting attributes:
Contratista,
Periodo this is determined by fecha cierre de la Orden,
Provincia this is determined by estructura logistica and Pais, 
Sociedad,
Tipo contrato -->

<!-- Confirmation Modal 
After confirmation reset fields to templata
After cancelation return to make more changes

After confirmation maybe show a table with last correct executions
-->

<template>
    <!-- <h1>INICIO</h1> -->
  
      <div class="flex flex-column gap-2">
        <label for="name">Pais</label>
        <InputText id="name" type="text" v-model="domiPais" aria-describedby="username-help" />
      <small id="username-help">Enter your username to reset your password.</small>
      </div>
  
    <!-- <div class="form-container">
      
      <input v-model="rangeOrderNum" type="text" placeholder="ABC1000">
      <input v-model="provincia" type="text" placeholder="Provincia" >
      <input v-model="tipoContrato" type="text" placeholder="Eventos, Eventos corp...">
      <input v-model="sociedad" type="text" placeholder="Sociedad">
      <input v-model="empresaContratista" type="text" placeholder="Empresa">
    </div> -->
    <br>
    <button @click="hello">GO</button>
  
    <!-- <h3>{{ domiPais }}</h3>
    <h3>{{ empresaContratista }}</h3> -->
  
  
    <h3 v-if="msg">{{ msg }}</h3>
    <details-table
      v-if="msg" 
      :dataObject="msg">
    </details-table>

    <order-range>
    </order-range>
  </template>
  
  
  <script>
  import { ref } from 'vue';
  import axios from 'axios';
  import DetailsTable from '@/components/DetailsTable.vue';
  import OrderRange from '@/components/OrderRange.vue';
  
  export default {
    components: { DetailsTable,
      OrderRange },
    name: 'OrderGen',
  
  //   Region
  // Subregion
  // Base Tecnica
  // Provincia
  // Tipo Contrato
  // Sociedad
  // Contratista
  
    setup() {
      const msg = ref(null)
      const jsonMensaje = ref('');
      const domiPais = ref('');
      const empresaContratista = ref('');
      const rangeOrderNum = ref('');
      const sociedad = ref('');
      const provincia = ref('');
      const tipoContrato = ref('');
      const nroOrdenTrabajo = ref('');
      const hello = async () => {
        const { data } = await axios.get('http://localhost:8080/api/messages/hello')
        jsonMensaje.value = JSON.parse(data.jsonMensaje)
        domiPais.value = jsonMensaje.value.domiPais==='ARG'?'ARGENTINA':jsonMensaje.value.domiPais
        empresaContratista.value = jsonMensaje.value.empresaContratista.nombre
        nroOrdenTrabajo.value = jsonMensaje.value.nroOrdenTrabajo
        // const { domiPais, empresaContratista } = data.value
        msg.value = {domiPais, empresaContratista, nroOrdenTrabajo}
      }
  
      return {
        domiPais,
        empresaContratista,
        jsonMensaje,
        msg,
        // msg: msg?msg:'Hello Vue 3 + TypeScript + Vite'
        provincia, 
        rangeOrderNum,
        sociedad,
        tipoContrato,
  
        hello,
      }
  
    },
  }
  </script>
  
  <style scoped>
  .container{
    display: flex;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
  
  }
  </style>
  