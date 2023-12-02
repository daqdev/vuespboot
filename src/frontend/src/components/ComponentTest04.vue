<template>
    
    <div class="card flex justify-content-center">
        <AutoComplete v-model="value" :suggestions="items" @complete="search" />
    </div>



    <!-- <div class="card flex justify-content-center flex-column gap-2">
        <span class="p-float-label">
            <InputText id="component_text" type="text" v-model="value" aria-describedby="component_text_d" />
            <label for="component_text">ComponentText4</label>
        </span>
        <small id="component_text_d">Enter your username to reset your password.</small>
    </div> -->
</template>

<script setup>

import { ref } from 'vue';

const value = ref("");
const items = ref([]);
const paises = ref([ "Argentina", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela" ]);

const search = (event) => {
    // items.value = [...Array(10).keys()].map((item) => event.query + '-' + item);
    items.value = paises.value.filter((item) => item.toUpperCase().includes (event.query.toUpperCase()));

}
</script>

<script>
export default {
    name: 'ComponentTest04'
}
</script>