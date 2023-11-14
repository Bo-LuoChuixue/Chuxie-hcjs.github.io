import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView,
    redirect:'/index',
    children:[{
      path:'/reg',
      component: () => import('../views/home/RegView')
    },{
      path:'/login',
      component: () => import('../views/home/LoginView')
    },{
      path:'/index',
      component: () => import('../views/home/IndexView')
    },{
      path:'/list',
      component: () => import('../views/home/ListView')
    },{
      path:'/detail',
      component: () => import('../views/home/DetailView')
    },{
      path:'/personal',
      component: () => import('../views/home/PersonalView')
    }]
  },
  {
    path: '/admin',
    component: () => import('../views/AdminView.vue'),
    redirect: '/admin/user',
    children: [{
      path: 'user',
      component: () => import('../views/admin/UserView'),
    },{
      path: 'banner',
      component: () => import('../views/admin/BannerView'),
    },{
      path: 'content',
      component: () => import('../views/admin/ContentView'),
    }]
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
