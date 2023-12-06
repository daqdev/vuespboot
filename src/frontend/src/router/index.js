import { createRouter, createWebHashHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: HomeView
    },
    {
        path: "/crear-ot",
        name: "createOt",
        component: () => import(/* webpackChunkName: "create-ot" */ "../views/OrderGen.vue"),
    },
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
});

export default router
