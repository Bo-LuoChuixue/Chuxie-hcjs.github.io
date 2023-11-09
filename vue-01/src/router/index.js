import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'  /*预加载*/

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',/*localhost:9090/about*/
    name: 'about',
    component: () => import('../views/AboutView') /*懒加载*/
  },{
    path: '/other',
    component: () => import('../views/OtherView') /*懒加载*/
  },{
    path: '/a',
    component: () => import('../views/AView') /*懒加载*/
  },{
    path: '/b',
    component: () => import('../views/BView') /*懒加载*/
  },{
    path: '/c',
    component: () => import('../views/CView') /*懒加载*/
  },{
    path: '/d',
    component: () => import('../views/DView') /*懒加载*/
  },{
    path: '/e',
    component: () => import('../views/EView') /*懒加载*/
  },{
    path: '/f',
    component: () => import('../views/FView') /*懒加载*/
  },{
    path: '/g',
    component: () => import('../views/GView') /*懒加载*/
  },{
    path: '/h',
    component: () => import('../views/HView') /*懒加载*/
  },{
    path: '/i',
    component: () => import('../views/IView') /*懒加载*/
  },{
    path: '/j',
    component: () => import('../views/JView') /*懒加载*/
  },{
    path: '/k',
    component: () => import('../views/KView') /*懒加载*/
  },{
    path: '/l',
    component: () => import('../views/LView') /*懒加载*/
  },{
    path: '/m',
    component: () => import('../views/MView') /*懒加载*/
  },{
    path: '/n',
    component: () => import('../views/NView') /*懒加载*/
  },{
    path: '/o',
    component: () => import('../views/OView') /*懒加载*/
  },{
    path: '/p',
    component: () => import('../views/PView') /*懒加载*/
  },{
    path: '/q',
    component: () => import('../views/QView') /*懒加载*/
  }, {
    path: '/r',
    component: () => import('../views/RView') /*懒加载*/
  }, {
    path: '/s',
    component: () => import('../views/SView') /*懒加载*/
  }, {
    path: '/t',
    component: () => import('../views/TView') /*懒加载*/
  },{
    path: '/u',
    component: () => import('../views/UView') /*懒加载*/
  }

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
