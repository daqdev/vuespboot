<template>
    <h1>Pantalla inicial</h1>
  </template>
  
  <script>
  import HelloWorld from '@/components/HelloWorld.vue'
  import ComponentTest01 from '@/components/ComponentTest01.vue'
  import ComponentTest02 from '@/components/ComponentTest02.vue'
  import ComponentTest03 from '@/components/ComponentTest03.vue'
  import ComponentTest04 from '@/components/ComponentTest04.vue'
  
  export default {
    name: 'HomeView',
    components: {
      HelloWorld,
    //   ComponentTest01,
    //   ComponentTest02,
    //   ComponentTest03,
    //   ComponentTest04,
    }
  }
  </script>
  
  <style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
  </style>
  