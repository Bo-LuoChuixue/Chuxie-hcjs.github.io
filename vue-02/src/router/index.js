import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView,
    redirect:'/index',
    children:[{
      path:'/index',
      component:() => import('../views/home/IndexView')
    },{
      path:'/detail',
      component:() => import('../views/home/DetailView')
    }]
  }, {
    path: '/admin',
    component: () => import('../views/AdminView.vue'),
    redirect: '/category',
    children:[{
      path: '/category',
      component: () => import('../views/admin/CategoryView.vue'),
    },{
      path: '/banner',
      component: () => import('../views/admin/BannerView.vue'),
    },{
      path: '/product',
      component: () => import('../views/admin/ProductView.vue'),
    },]
  }, {
    path: '/reg',
    component: () => import('../views/RegView.vue')
  }, {
    path: '/login',
    component: () => import('../views/LoginView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
