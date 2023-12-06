<template>
    <div class="card flex flex-column md:flex-row gap-3">

        <InputGroup>
            <!-- <InputGroupAddon><i class="pi pi-user"></i></InputGroupAddon> -->
            <InputText v-model="alphabeticalValue" :validator="validateAlphabetical" placeholder="patron" />
        </InputGroup>

        <InputGroup>
            <!-- <InputGroupAddon>$</InputGroupAddon> -->
            <InputNumber v-model="numericValue" :validator="validateNumeric" :formatter="formatNumber"
                placeholder="desde" />
            <!-- <InputGroupAddon>.00</InputGroupAddon> -->
        </InputGroup>

        <InputGroup>
            <!-- <InputGroupAddon>www</InputGroupAddon> -->
            <InputNumber v-model="greaterValue" :validator="validateGreater" placeholder="hasta" />
        </InputGroup>
    </div>
</template>

<script>
import { ref } from 'vue';
import { InputText } from 'primevue/inputtext';
import { InputNumber } from 'primevue/inputnumber';
import { InputGroup } from 'primevue/inputgroup';


export default {
    components: {
        InputText,
        InputNumber,
        InputGroup
    },
    setup() {
        const alphabeticalValue = ref('');
        const numericValue = ref('');
        const greaterValue = ref('');

        const validateAlphabetical = (value) => {
            if (value.length < 3) {
                return {
                    valid: false,
                    message: 'The alphabetical value must be at least 3 characters'
                };
            }
            return { valid: true };
        }

        const validateNumeric = (value) => {
            if (value.length < 3) {
                return {
                    valid: false,
                    message: 'The numeric value must be at least 3 characters'
                };
            }
            return { valid: true };
        }

        const validateGreater = (value) => {
            if (value.length < 3) {
                return {
                    valid: false,
                    message: 'The greater value must be at least 3 characters'
                };
            }
            return { valid: true };
        }
        const formatNumber = (value) => {
            // Custom formatter to remove the colon at thousands
            return value.toString().replace(/,/g, '');
        }

        return {
            alphabeticalValue,
            numericValue,
            greaterValue,
            validateAlphabetical,
            validateNumeric,
            validateGreater,
            formatNumber
        };
    },
}

</script>
<style scoped>
.InputText {
    width: 100%;
    padding: 1rem 1rem;
    /* Adjust the margin as needed */
}
</style>