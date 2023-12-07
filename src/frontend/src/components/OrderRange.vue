<template>
    <div class="flex card md:flex-row gap-2">
        <InputGroup>
            <span class="p-float-label">
            <InputText id="alphabeticalValueId" v-model="alphabeticalValue" placeholder="Ej.: ABC"/>
            <label for="alphabeticalValueId">Patron ej: ABC</label>
            </span>
        </InputGroup>

        <InputGroup>
            <span class="p-float-label">
                <InputNumber id="numericValueId" v-model="numericValue" :use-grouping="false" placeholder="Ej: 100" />
                <label for="numericValueId">Numero base ej: 100</label>
            </span>
        </InputGroup>
    </div>
</template>

<script>
import { ref, watch } from 'vue';
import InputText from 'primevue/inputtext';
import InputNumber from 'primevue/inputnumber';
import InputGroup from 'primevue/inputgroup';


export default {
    components: {
        InputText,
        InputNumber,
        InputGroup
    },
    setup() {
        const alphabeticalValue = ref('');
        const numericValue = ref(null);

        return {
            alphabeticalValue,
            numericValue,
        };
    },
}

</script>
<style scoped>
</style>