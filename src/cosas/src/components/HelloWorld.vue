<template>
  <h1>INICIO</h1>
  <button @click="hello">press</button>
  <h3 v-if="msg">{{ msg }}</h3>
</template>


<script>
import { ref } from 'vue';
import axios from 'axios';

export default {
  name: 'HelloWorld',
  props: {
    msg: {
      type: String,
      required: false
    }
  },

  setup() {
    const msg = ref('')
    const hello = async () => {
      const { data } = await axios.get('http://localhost:8080/api/messages/hello')
      msg.value = data
    }

    return {
      msg,
      // msg: msg?msg:'Hello Vue 3 + TypeScript + Vite'
      hello,
    }

  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
