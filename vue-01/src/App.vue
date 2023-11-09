<template>
  <nav>
<!--  router-link类似超链接  -->
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link> |
    <router-link to="/other">其它</router-link> |
    <router-link to="/a">文本相关指令</router-link> |
    <router-link to="/b">属性绑定</router-link> |
    <router-link to="/c">双向绑定</router-link>|
    <router-link to="/d">事件绑定</router-link>|
    <router-link to="/e">计算器练习</router-link>|
    <router-link to="/f">猜数字练习</router-link>|
    <router-link to="/g">循环遍历指令</router-link>|
    <router-link to="/h">员工列表练习</router-link>|
    <router-link to="/i">综合练习</router-link>|
    <router-link to="/j">显示隐藏指令</router-link>|
    <router-link to="/k">按钮组件</router-link>|
    <router-link to="/l">图标组件</router-link>|
    <router-link to="/m">消息提示组件</router-link>|
    <router-link to="/n">单选组件</router-link>|
    <router-link to="/o">选择器组件</router-link>|
    <router-link to="/p">开关组件</router-link>|
    <router-link to="/q">表单组件</router-link>|
    <router-link to="/r">表格组件</router-link>|
    <router-link to="/s">员工列表练习进化版</router-link>|
    <router-link to="/t">菜单组件</router-link>|
    <router-link to="/u">布局组件</router-link>|
    <router-link to="/v">布局容器</router-link>|
  </nav>
<!--通过router-view展示不同的内容-->
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>

