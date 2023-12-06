<template>
  <div class="card flex flex-column md:flex-row gap-3">
    <InputGroup>
        <InputGroupAddon>
            <i class="pi pi-user"></i>
        </InputGroupAddon>
        <InputText placeholder="Username" />
    </InputGroup>
  </div>
  <section class="card border-collapse border-separate bg-white dark:bg-gray-800 p-4 rounded-lg shadow-lg dark:shadow-white">
    <table class="w-full">
      <thead v-if="showHead">
        <tr>
          <th class="p-4 bg-blue-500 text-white font-bold dark:bg-blue-700">Attribute</th>
          <th class="p-4 bg-blue-200 text-gray-700 dark:bg-blue-900 border-l border-black dark:border-gray-700">
            Value
          </th>
        </tr>
      </thead>
      <tbody>
          <!-- <tr class="border-b border-black dark:border-gray-700"> -->
          <!-- <td class="p-4 bg-gray-500 text-white font-bold dark:bg-gray-700">Color</td> -->
          <tr class="border-b border-black dark:border-gray-700" v-for="(value, key) in dataObject" :key="key">
          <td class="p-4 bg-gray-500 text-white font-bold dark:bg-gray-700">{{ key }}</td>
          <td class="p-4 bg-gray-200 text-gray-700 dark:bg-gray-900 border-l border-black dark:border-gray-700">
            {{ value }}
          </td>
        </tr>
      </tbody>
    </table>
  </section>    
</template>

<script>

import InputGroup from 'primevue/inputgroup';
import InputGroupAddon from 'primevue/inputgroupaddon';

export default {
  name: 'DetailsTable',
  props:{
    dataObject:{
      type:Object,
      required:true
    }
  },
    components: {
        InputGroup,
        InputGroupAddon
    },
    setup() {
        console.log("probando details table");
        return{
            showHead:true
        }
    }
}
</script>