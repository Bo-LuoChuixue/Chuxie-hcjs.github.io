import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//引入Element框架相关内容
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//引入图标相关
import * as ElementPlusIconsVue from '@element-plus/icons-vue'


const BASE_URL = 'http://localhost:8080'
//定义全局URL变量
window.BASE_URL = BASE_URL;
//定义全局方法
window.getUser = ()=>{
    return localStorage.user?JSON.parse(localStorage.user):null;
}

let app = createApp(App);

//在Vue实例中添加全局属性
app.config.globalProperties.BASE_URL = BASE_URL;

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(ElementPlus).use(store).use(router).mount('#app')
