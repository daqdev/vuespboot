<template>
    <div class="flex flex-column gap-2">
        <label for="component_text">ComponentText2</label>
        <InputText id="component_text" type="text" v-model="value" aria-describedby="component_text" />
        <small id="component_text">Enter your username to reset your password.</small>
    </div>
</template>

<script setup>

import InputText from 'primevue/inputtext';
import { ref } from 'vue';

const value = ref(null);
</script>

<script>
export default {
    name: 'ComponentTest02'
}</script>