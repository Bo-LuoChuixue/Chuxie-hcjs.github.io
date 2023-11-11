import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//引入Element框架相关内容
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//引入图标相关
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

let app = createApp(App);
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(ElementPlus).use(store).use(router).mount('#app')
