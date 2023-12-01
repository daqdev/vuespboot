<template>
  <h1>INICIO</h1>
  <div class="form-container">
    
    <input v-model="rangeOrderNum" type="text" placeholder="ABC1000">
    <input v-model="provincia" type="text" placeholder="Provincia" >
    <input v-model="tipoContrato" type="text" placeholder="Eventos, Eventos corp...">
    <input v-model="sociedad" type="text" placeholder="Sociedad">
    <input v-model="empresaContratista" type="text" placeholder="Empresa">
  </div>
  <br>
  <button @click="hello">GO</button>

  <h3>{{ domiPais }}</h3>
  <h3>{{ empresaContratista }}</h3>


  <h3 v-if="jsonMensaje">{{ jsonMensaje }}</h3>
</template>


<script>
import { ref } from 'vue';
import axios from 'axios';

export default {
  name: 'HelloWorld',
  components: {
    
  },
  props: {
    msg: {
      type: String,
      required: false
    }
  },

//   Region
// Subregion
// Base Tecnica
// Provincia
// Tipo Contrato
// Sociedad
// Contratista

  setup() {
    const msg = ref('')
    const jsonMensaje = ref('');
    const domiPais = ref('');
    const empresaContratista = ref('');
    const hello = async () => {
      const { data } = await axios.get('http://localhost:8080/api/messages/hello')
      jsonMensaje.value = JSON.parse(data.jsonMensaje)
      domiPais.value = jsonMensaje.value.domiPais==='ARG'?'ARGENTINA':jsonMensaje.value.domiPais
      empresaContratista.value = jsonMensaje.value.empresaContratista.nombre
      // const { domiPais, empresaContratista } = data.value
      msg.value = data
    }

    return {
      msg,
      jsonMensaje,
      domiPais,
      empresaContratista,
      // msg: msg?msg:'Hello Vue 3 + TypeScript + Vite'
      hello,
    }

  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.form-container {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.form-input {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
