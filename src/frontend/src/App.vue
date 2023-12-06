<template>

  <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/crear-ot">Cargar Ordenes</router-link>
  </nav>

  <router-view v-slot="{ Component, route }">
    <keep-alive>
      <component :is="Component" :key="route.name"></component>
    </keep-alive>

  </router-view>

</template>

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
