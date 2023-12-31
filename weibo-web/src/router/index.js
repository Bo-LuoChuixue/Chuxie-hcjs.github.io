import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/reg',
    component: () => import( '../views/RegView.vue')
  },
  {
    path: '/login',
    component: () => import( '../views/LoginView.vue')
  },
  {
    path: '/post',
    component: () => import( '../views/PostView.vue')
  },
  {
    path: '/detail',
    component: () => import( '../views/DetailView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
