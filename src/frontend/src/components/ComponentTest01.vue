<template>
    <div class="card flex justify-content-center">
        <InputText id="component-text" type="text" v-model="value" />
    </div>
</template>

<script setup>

import { ref } from 'vue';

const value = ref(null);
</script>

<script>
export default {
    name: 'ComponentTest01'
}</script>