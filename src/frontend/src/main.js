import { createApp } from 'vue'
import App from './App.vue'
import PrimeVue from 'primevue/config';


import InputText from 'primevue/inputtext';
import Button from 'primevue/button';
import Toast from 'primevue/toast';
import ToastService from 'primevue/toastservice';
import AutoComplete from 'primevue/autocomplete';


import "primevue/resources/themes/lara-light-green/theme.css";
import 'primevue/resources/primevue.min.css';
import 'primeicons/primeicons.css';
import "primeflex/primeflex.css";

createApp(App)

.use(PrimeVue)
.use(ToastService)
.use(AutoComplete)
.component('InputText', InputText)
.component('Button', Button)
.component('AutoComplete', AutoComplete)
.component('Toast', Toast)


.mount('#app')


