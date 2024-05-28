import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fangwuxinxi from '@/views/modules/fangwuxinxi/list'
    import weixiushuju from '@/views/modules/weixiushuju/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import zulinhetong from '@/views/modules/zulinhetong/list'
    import kanfangshenqing from '@/views/modules/kanfangshenqing/list'
    import shouzutongji from '@/views/modules/shouzutongji/list'
    import huzhu from '@/views/modules/huzhu/list'
    import shouzuxinxi from '@/views/modules/shouzuxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import zuke from '@/views/modules/zuke/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/fangwuxinxi',
        name: '房屋信息',
        component: fangwuxinxi
      }
          ,{
	path: '/weixiushuju',
        name: '维修数据',
        component: weixiushuju
      }
          ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
          ,{
	path: '/zulinhetong',
        name: '租赁合同',
        component: zulinhetong
      }
          ,{
	path: '/kanfangshenqing',
        name: '看房申请',
        component: kanfangshenqing
      }
          ,{
	path: '/shouzutongji',
        name: '收租统计',
        component: shouzutongji
      }
          ,{
	path: '/huzhu',
        name: '户主',
        component: huzhu
      }
          ,{
	path: '/shouzuxinxi',
        name: '收租信息',
        component: shouzuxinxi
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/zuke',
        name: '租客',
        component: zuke
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
