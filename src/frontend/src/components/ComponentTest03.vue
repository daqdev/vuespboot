<template>
    <div class="card flex justify-content-center flex-column gap-2">
        <span class="p-float-label">
            <InputText id="component_text" type="text" v-model="value" aria-describedby="component_text_d" />
            <label for="component_text">ComponentText3</label>
        </span>
        <small id="component_text_d">Enter your username to reset your password.</small>
    </div>
</template>

<script setup>

import InputText from 'primevue/inputtext';
import { ref } from 'vue';

const value = ref(null);
</script>

<script>
export default {
    name: 'ComponentTest03'
}
</script>