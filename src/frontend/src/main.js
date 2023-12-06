import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import PrimeVue from 'primevue/config';


import InputText from 'primevue/inputtext';
import InputNumber from 'primevue/inputnumber';
import Button from 'primevue/button';
import Toast from 'primevue/toast';
import ToastService from 'primevue/toastservice';
import AutoComplete from 'primevue/autocomplete';


import "primevue/resources/themes/lara-light-green/theme.css";
import 'primevue/resources/primevue.min.css';
import 'primeicons/primeicons.css';
import "primeflex/primeflex.css";
import './style.css'

createApp(App)

.use(router)
.use(PrimeVue)
.use(ToastService)
.use(AutoComplete)
.component('InputText', InputText)
.component('InputNumber', InputNumber)
.component('Button', Button)
.component('AutoComplete', AutoComplete)
.component('Toast', Toast)


.mount('#app')


