<template>
  <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
  <HelloWorld msg="Welcome" />

  <hr>

  <ComponentTest01 />
  <hr>
  <ComponentTest02 />
  <hr><br>
  <ComponentTest03 />

  <hr><br>
  <ComponentTest04 />
  <hr><br>
  <DetailsTable />
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import ComponentTest01 from './components/ComponentTest01.vue'
import ComponentTest02 from './components/ComponentTest02.vue'
import ComponentTest03 from './components/ComponentTest03.vue'
import ComponentTest04 from './components/ComponentTest04.vue'
import DetailsTable from './components/DetailsTable.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
    ComponentTest01,
    ComponentTest02,
    ComponentTest03,
    ComponentTest04,
    DetailsTable
  }
}
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
