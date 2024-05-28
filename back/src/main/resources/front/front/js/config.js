
var projectName = '房屋租赁系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '公告信息',
	url: './pages/gonggaoxinxi/list.html'
}, 
{
	name: '房屋信息',
	url: './pages/fangwuxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springboot93c4v/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"租客","menuJump":"列表","tableName":"zuke"}],"menu":"租客管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"户主","menuJump":"列表","tableName":"huzhu"}],"menu":"户主管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"看房申请","menuJump":"列表","tableName":"kanfangshenqing"}],"menu":"看房申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"租赁合同","menuJump":"列表","tableName":"zulinhetong"}],"menu":"租赁合同管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收租信息","menuJump":"列表","tableName":"shouzuxinxi"}],"menu":"收租信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"收租统计","menuJump":"列表","tableName":"shouzutongji"}],"menu":"收租统计管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"维修数据","menuJump":"列表","tableName":"weixiushuju"}],"menu":"维修数据管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["看房申请","查看"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"看房申请","menuJump":"列表","tableName":"kanfangshenqing"}],"menu":"看房申请管理"},{"child":[{"buttons":["查看"],"menu":"租赁合同","menuJump":"列表","tableName":"zulinhetong"}],"menu":"租赁合同管理"},{"child":[{"buttons":["查看"],"menu":"收租信息","menuJump":"列表","tableName":"shouzuxinxi"}],"menu":"收租信息管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["看房申请","查看"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"租客","tableName":"zuke"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
