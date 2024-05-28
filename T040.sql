/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb3 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP DATABASE IF EXISTS `t040`;
CREATE DATABASE IF NOT EXISTS `t040` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `t040`;

DROP TABLE IF EXISTS `baoxiuxinxi`;
CREATE TABLE IF NOT EXISTS `baoxiuxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangwubianhao` varchar(200) DEFAULT NULL COMMENT '房屋编号',
  `xiangxidizhi` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `baoxiuneirong` longtext COMMENT '报修内容',
  `baoxiuzhuangtai` varchar(200) DEFAULT NULL COMMENT '报修状态',
  `baoxiushijian` date DEFAULT NULL COMMENT '报修时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615611696420 DEFAULT CHARSET=utf8mb3 COMMENT='报修信息';

DELETE FROM `baoxiuxinxi`;
INSERT INTO `baoxiuxinxi` (`id`, `addtime`, `fangwubianhao`, `xiangxidizhi`, `mingcheng`, `baoxiuneirong`, `baoxiuzhuangtai`, `baoxiushijian`, `zhanghao`, `xingming`, `shouji`, `tupian`) VALUES
	(81, '2021-03-13 04:56:55', '房屋编号1', '详细地址1', '名称1', '报修内容1', '正常', '2021-03-13', '账号1', '姓名1', '手机1', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian1.jpg'),
	(82, '2021-03-13 04:56:55', '房屋编号2', '详细地址2', '名称2', '报修内容2', '正常', '2021-03-13', '账号2', '姓名2', '手机2', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian2.jpg'),
	(83, '2021-03-13 04:56:55', '房屋编号3', '详细地址3', '名称3', '报修内容3', '正常', '2021-03-13', '账号3', '姓名3', '手机3', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian3.jpg'),
	(84, '2021-03-13 04:56:55', '房屋编号4', '详细地址4', '名称4', '报修内容4', '正常', '2021-03-13', '账号4', '姓名4', '手机4', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian4.jpg'),
	(85, '2021-03-13 04:56:55', '房屋编号5', '详细地址5', '名称5', '报修内容5', '正常', '2021-03-13', '账号5', '姓名5', '手机5', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian5.jpg'),
	(86, '2021-03-13 04:56:55', '房屋编号6', '详细地址6', '名称6', '报修内容6', '正常', '2021-03-13', '账号6', '姓名6', '手机6', 'http://localhost:8080/springboot93c4v/upload/baoxiuxinxi_tupian6.jpg'),
	(1615611696419, '2021-03-13 05:01:35', '房屋编号1', '详细地址1', '官方回复', '发鬼地方个', '故障', '2021-03-18', '11', '地方', '11111111111', 'http://localhost:8080/springboot93c4v/upload/1615611694341.jpg');

DROP TABLE IF EXISTS `config`;
CREATE TABLE IF NOT EXISTS `config` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COMMENT='配置文件';

DELETE FROM `config`;
INSERT INTO `config` (`id`, `name`, `value`) VALUES
	(1, 'picture1', 'http://localhost:8080/springboot93c4v/upload/picture1.jpg'),
	(2, 'picture2', 'http://localhost:8080/springboot93c4v/upload/picture2.jpg'),
	(3, 'picture3', 'http://localhost:8080/springboot93c4v/upload/picture3.jpg'),
	(6, 'homepage', 'https://asoa-1305425069.cos.ap-shanghai.myqcloud.com/1669635627773202432.png');

DROP TABLE IF EXISTS `fangwuxinxi`;
CREATE TABLE IF NOT EXISTS `fangwuxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangwubianhao` varchar(200) DEFAULT NULL COMMENT '房屋编号',
  `fangyuanleixing` varchar(200) DEFAULT NULL COMMENT '房源类型',
  `fangwuhuxing` varchar(200) DEFAULT NULL COMMENT '房屋户型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `mianji` varchar(200) DEFAULT NULL COMMENT '面积',
  `zujia` int DEFAULT NULL COMMENT '租价',
  `huzhuxingming` varchar(200) DEFAULT NULL COMMENT '户主姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `suozaishengfen` varchar(200) DEFAULT NULL COMMENT '所在省份',
  `suozaichengshi` varchar(200) DEFAULT NULL COMMENT '所在城市',
  `suozaidiqu` varchar(200) DEFAULT NULL COMMENT '所在地区',
  `xiangxidizhi` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `xiangqing` longtext COMMENT '详情',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fangwubianhao` (`fangwubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb3 COMMENT='房屋信息';

DELETE FROM `fangwuxinxi`;
INSERT INTO `fangwuxinxi` (`id`, `addtime`, `fangwubianhao`, `fangyuanleixing`, `fangwuhuxing`, `tupian`, `zhuangtai`, `mianji`, `zujia`, `huzhuxingming`, `lianxifangshi`, `fabushijian`, `suozaishengfen`, `suozaichengshi`, `suozaidiqu`, `xiangxidizhi`, `xiangqing`, `clicktime`, `clicknum`) VALUES
	(41, '2021-03-13 04:56:55', '房屋编号1', '房源类型1', '房屋户型1', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian1.jpg', '已租', '面积1', 1, '户主姓名1', '联系方式1', '2021-03-13', '所在省份1', '所在城市1', '所在地区1', '详细地址1', '详情1', '2024-01-12 09:11:24', 3),
	(42, '2021-03-13 04:56:55', '房屋编号2', '房源类型2', '房屋户型2', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian2.jpg', '已租', '面积2', 2, '户主姓名2', '联系方式2', '2021-03-13', '所在省份2', '所在城市2', '所在地区2', '详细地址2', '详情2', '2024-01-12 09:13:30', 3),
	(43, '2021-03-13 04:56:55', '房屋编号3', '房源类型3', '房屋户型3', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian3.jpg', '已租', '面积3', 3, '户主姓名3', '联系方式3', '2021-03-13', '所在省份3', '所在城市3', '所在地区3', '详细地址3', '详情3', '2021-03-13 12:56:55', 3),
	(44, '2021-03-13 04:56:55', '房屋编号4', '房源类型4', '房屋户型4', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian4.jpg', '已租', '面积4', 4, '户主姓名4', '联系方式4', '2021-03-13', '所在省份4', '所在城市4', '所在地区4', '详细地址4', '详情4', '2024-01-12 09:14:43', 5),
	(45, '2021-03-13 04:56:55', '房屋编号5', '房源类型5', '房屋户型5', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian5.jpg', '已租', '面积5', 5, '户主姓名5', '联系方式5', '2021-03-13', '所在省份5', '所在城市5', '所在地区5', '详细地址5', '详情5', '2021-03-13 12:56:55', 5),
	(46, '2021-03-13 04:56:55', '房屋编号6', '房源类型6', '房屋户型6', 'http://localhost:8080/springboot93c4v/upload/fangwuxinxi_tupian6.jpg', '已租', '面积6', 6, '户主姓名6', '联系方式6', '2021-03-13', '所在省份6', '所在城市6', '所在地区6', '详细地址6', '详情6', '2021-03-13 12:56:55', 6);

DROP TABLE IF EXISTS `gonggaoxinxi`;
CREATE TABLE IF NOT EXISTS `gonggaoxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `jianjie` longtext COMMENT '简介',
  `neirong` longtext COMMENT '内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COMMENT='公告信息';

DELETE FROM `gonggaoxinxi`;
INSERT INTO `gonggaoxinxi` (`id`, `addtime`, `biaoti`, `jianjie`, `neirong`, `fabushijian`, `faburen`, `fengmian`, `clicktime`, `clicknum`) VALUES
	(11, '2021-03-13 04:56:54', '标题1', '简介1', '内容1', '2021-03-13', '发布人1', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian1.jpg', '2024-01-12 09:14:35', 4),
	(12, '2021-03-13 04:56:54', '标题2', '简介2', '内容2', '2021-03-13', '发布人2', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian2.jpg', '2021-03-13 12:56:54', 2),
	(13, '2021-03-13 04:56:54', '标题3', '简介3', '内容3', '2021-03-13', '发布人3', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian3.jpg', '2024-01-12 09:13:12', 4),
	(14, '2021-03-13 04:56:54', '标题4', '简介4', '内容4', '2021-03-13', '发布人4', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian4.jpg', '2021-03-13 12:56:54', 4),
	(15, '2021-03-13 04:56:54', '标题5', '简介5', '内容5', '2021-03-13', '发布人5', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian5.jpg', '2021-03-13 12:56:54', 5),
	(16, '2021-03-13 04:56:54', '标题6', '简介6', '内容6', '2021-03-13', '发布人6', 'http://localhost:8080/springboot93c4v/upload/gonggaoxinxi_fengmian6.jpg', '2021-03-13 12:56:54', 6);

DROP TABLE IF EXISTS `huzhu`;
CREATE TABLE IF NOT EXISTS `huzhu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huzhuxingming` varchar(200) NOT NULL COMMENT '户主姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb3 COMMENT='户主';

DELETE FROM `huzhu`;
INSERT INTO `huzhu` (`id`, `addtime`, `huzhuxingming`, `xingbie`, `lianxifangshi`, `youxiang`, `shenfenzheng`, `zhaopian`, `dizhi`) VALUES
	(31, '2021-03-13 04:56:55', '户主姓名1', '男', '13823888881', '773890001@qq.com', '440300199101010001', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian1.jpg', '地址1'),
	(32, '2021-03-13 04:56:55', '户主姓名2', '男', '13823888882', '773890002@qq.com', '440300199202020002', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian2.jpg', '地址2'),
	(33, '2021-03-13 04:56:55', '户主姓名3', '男', '13823888883', '773890003@qq.com', '440300199303030003', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian3.jpg', '地址3'),
	(34, '2021-03-13 04:56:55', '户主姓名4', '男', '13823888884', '773890004@qq.com', '440300199404040004', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian4.jpg', '地址4'),
	(35, '2021-03-13 04:56:55', '户主姓名5', '男', '13823888885', '773890005@qq.com', '440300199505050005', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian5.jpg', '地址5'),
	(36, '2021-03-13 04:56:55', '户主姓名6', '男', '13823888886', '773890006@qq.com', '440300199606060006', 'http://localhost:8080/springboot93c4v/upload/huzhu_zhaopian6.jpg', '地址6');

DROP TABLE IF EXISTS `kanfangshenqing`;
CREATE TABLE IF NOT EXISTS `kanfangshenqing` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `kanfangshijian` date DEFAULT NULL COMMENT '看房时间',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `fangwubianhao` varchar(200) DEFAULT NULL COMMENT '房屋编号',
  `zujia` varchar(200) DEFAULT NULL COMMENT '租价',
  `mianji` varchar(200) DEFAULT NULL COMMENT '面积',
  `xiangxidizhi` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `beizhu` longtext COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb3 COMMENT='看房申请';

DELETE FROM `kanfangshenqing`;
INSERT INTO `kanfangshenqing` (`id`, `addtime`, `zhanghao`, `xingming`, `shouji`, `shenfenzheng`, `kanfangshijian`, `shenqingriqi`, `fangwubianhao`, `zujia`, `mianji`, `xiangxidizhi`, `beizhu`, `sfsh`, `shhf`) VALUES
	(51, '2021-03-13 04:56:55', '账号1', '姓名1', '手机1', '身份证1', '2021-03-13', '2021-03-13', '房屋编号1', '租价1', '面积1', '详细地址1', '备注1', '是', ''),
	(52, '2021-03-13 04:56:55', '账号2', '姓名2', '手机2', '身份证2', '2021-03-13', '2021-03-13', '房屋编号2', '租价2', '面积2', '详细地址2', '备注2', '是', ''),
	(53, '2021-03-13 04:56:55', '账号3', '姓名3', '手机3', '身份证3', '2021-03-13', '2021-03-13', '房屋编号3', '租价3', '面积3', '详细地址3', '备注3', '是', ''),
	(54, '2021-03-13 04:56:55', '账号4', '姓名4', '手机4', '身份证4', '2021-03-13', '2021-03-13', '房屋编号4', '租价4', '面积4', '详细地址4', '备注4', '是', ''),
	(55, '2021-03-13 04:56:55', '账号5', '姓名5', '手机5', '身份证5', '2021-03-13', '2021-03-13', '房屋编号5', '租价5', '面积5', '详细地址5', '备注5', '是', ''),
	(56, '2021-03-13 04:56:55', '账号6', '姓名6', '手机6', '身份证6', '2021-03-13', '2021-03-13', '房屋编号6', '租价6', '面积6', '详细地址6', '备注6', '是', '');

DROP TABLE IF EXISTS `shouzutongji`;
CREATE TABLE IF NOT EXISTS `shouzutongji` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shouzutongji` varchar(200) DEFAULT NULL COMMENT '收租统计',
  `shouzurenshu` int DEFAULT NULL COMMENT '收租人数',
  `shouzujine` int DEFAULT NULL COMMENT '收租金额',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  `yuefen` varchar(200) DEFAULT NULL COMMENT '月份',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8mb3 COMMENT='收租统计';

DELETE FROM `shouzutongji`;
INSERT INTO `shouzutongji` (`id`, `addtime`, `shouzutongji`, `shouzurenshu`, `shouzujine`, `dengjishijian`, `yuefen`, `beizhu`) VALUES
	(91, '2021-03-13 04:56:55', '收租统计1', 1, 1, '2021-03-13', '月份1', '备注1'),
	(92, '2021-03-13 04:56:55', '收租统计2', 2, 2, '2021-03-13', '月份2', '备注2'),
	(93, '2021-03-13 04:56:55', '收租统计3', 3, 3, '2021-03-13', '月份3', '备注3'),
	(94, '2021-03-13 04:56:55', '收租统计4', 4, 4, '2021-03-13', '月份4', '备注4'),
	(95, '2021-03-13 04:56:55', '收租统计5', 5, 5, '2021-03-13', '月份5', '备注5'),
	(96, '2021-03-13 04:56:55', '收租统计6', 6, 6, '2021-03-13', '月份6', '备注6');

DROP TABLE IF EXISTS `shouzuxinxi`;
CREATE TABLE IF NOT EXISTS `shouzuxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shouzubianhao` varchar(200) DEFAULT NULL COMMENT '收租编号',
  `fangwubianhao` varchar(200) DEFAULT NULL COMMENT '房屋编号',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `kaishishijian` date DEFAULT NULL COMMENT '开始时间',
  `jiezhishijian` date DEFAULT NULL COMMENT '截止时间',
  `jiaofeishijian` date DEFAULT NULL COMMENT '缴费时间',
  `zujia` varchar(200) DEFAULT NULL COMMENT '租价',
  `zufangzhuangtai` varchar(200) DEFAULT NULL COMMENT '租房状态',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shouzubianhao` (`shouzubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb3 COMMENT='收租信息';

DELETE FROM `shouzuxinxi`;
INSERT INTO `shouzuxinxi` (`id`, `addtime`, `shouzubianhao`, `fangwubianhao`, `zhanghao`, `xingming`, `shenfenzheng`, `shouji`, `kaishishijian`, `jiezhishijian`, `jiaofeishijian`, `zujia`, `zufangzhuangtai`, `dengjiriqi`, `beizhu`) VALUES
	(71, '2021-03-13 04:56:55', '收租编号1', '房屋编号1', '账号1', '姓名1', '身份证1', '手机1', '2021-03-13', '2021-03-13', '2021-03-13', '租价1', '已交', '2021-03-13', '备注1'),
	(72, '2021-03-13 04:56:55', '收租编号2', '房屋编号2', '账号2', '姓名2', '身份证2', '手机2', '2021-03-13', '2021-03-13', '2021-03-13', '租价2', '已交', '2021-03-13', '备注2'),
	(73, '2021-03-13 04:56:55', '收租编号3', '房屋编号3', '账号3', '姓名3', '身份证3', '手机3', '2021-03-13', '2021-03-13', '2021-03-13', '租价3', '已交', '2021-03-13', '备注3'),
	(74, '2021-03-13 04:56:55', '收租编号4', '房屋编号4', '账号4', '姓名4', '身份证4', '手机4', '2021-03-13', '2021-03-13', '2021-03-13', '租价4', '已交', '2021-03-13', '备注4'),
	(75, '2021-03-13 04:56:55', '收租编号5', '房屋编号5', '账号5', '姓名5', '身份证5', '手机5', '2021-03-13', '2021-03-13', '2021-03-13', '租价5', '已交', '2021-03-13', '备注5'),
	(76, '2021-03-13 04:56:55', '收租编号6', '房屋编号6', '账号6', '姓名6', '身份证6', '手机6', '2021-03-13', '2021-03-13', '2021-03-13', '租价6', '已交', '2021-03-13', '备注6');

DROP TABLE IF EXISTS `token`;
CREATE TABLE IF NOT EXISTS `token` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COMMENT='token表';

DELETE FROM `token`;
INSERT INTO `token` (`id`, `userid`, `username`, `tablename`, `role`, `token`, `addtime`, `expiratedtime`) VALUES
	(1, 1, 'abo', 'users', '管理员', '5d962mlycfrihesxkmaibwzfboeuq6cl', '2021-03-13 04:59:21', '2024-01-12 02:13:04'),
	(2, 1615611582075, '11', 'zuke', '租客', 'wxi3zq5t32ke8j991oa87gzifgah252u', '2021-03-13 04:59:47', '2021-03-13 05:59:48'),
	(3, 21, '租客1', 'zuke', '租客', 'k514z08gktzdhmj2sezk35nm52u9ioqc', '2024-01-12 01:12:05', '2024-01-12 02:14:12');

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='用户表';

DELETE FROM `users`;
INSERT INTO `users` (`id`, `username`, `password`, `role`, `addtime`) VALUES
	(1, 'admin', '123456', '管理员', '2021-03-13 04:56:55');

DROP TABLE IF EXISTS `weixiushuju`;
CREATE TABLE IF NOT EXISTS `weixiushuju` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weixiuwupin` varchar(200) DEFAULT NULL COMMENT '维修物品',
  `weixiucishu` int DEFAULT NULL COMMENT '维修次数',
  `yuefen` varchar(200) DEFAULT NULL COMMENT '月份',
  `weixiurenyuan` varchar(200) DEFAULT NULL COMMENT '维修人员',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb3 COMMENT='维修数据';

DELETE FROM `weixiushuju`;
INSERT INTO `weixiushuju` (`id`, `addtime`, `weixiuwupin`, `weixiucishu`, `yuefen`, `weixiurenyuan`, `dengjiriqi`, `beizhu`) VALUES
	(101, '2021-03-13 04:56:55', '维修物品1', 1, '月份1', '维修人员1', '2021-03-13', '备注1'),
	(102, '2021-03-13 04:56:55', '维修物品2', 2, '月份2', '维修人员2', '2021-03-13', '备注2'),
	(103, '2021-03-13 04:56:55', '维修物品3', 3, '月份3', '维修人员3', '2021-03-13', '备注3'),
	(104, '2021-03-13 04:56:55', '维修物品4', 4, '月份4', '维修人员4', '2021-03-13', '备注4'),
	(105, '2021-03-13 04:56:55', '维修物品5', 5, '月份5', '维修人员5', '2021-03-13', '备注5'),
	(106, '2021-03-13 04:56:55', '维修物品6', 6, '月份6', '维修人员6', '2021-03-13', '备注6');

DROP TABLE IF EXISTS `zuke`;
CREATE TABLE IF NOT EXISTS `zuke` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `zhiye` varchar(200) DEFAULT NULL COMMENT '职业',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615611582076 DEFAULT CHARSET=utf8mb3 COMMENT='租客';

DELETE FROM `zuke`;
INSERT INTO `zuke` (`id`, `addtime`, `zhanghao`, `mima`, `xingming`, `zhiye`, `xingbie`, `shouji`, `youxiang`, `shenfenzheng`, `zhaopian`, `dizhi`) VALUES
	(21, '2021-03-13 04:56:55', '租客1', '123456', '姓名1', '职业1', '男', '13823888881', '773890001@qq.com', '440300199101010001', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian1.jpg', '地址1'),
	(22, '2021-03-13 04:56:55', '租客2', '123456', '姓名2', '职业2', '男', '13823888882', '773890002@qq.com', '440300199202020002', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian2.jpg', '地址2'),
	(23, '2021-03-13 04:56:55', '租客3', '123456', '姓名3', '职业3', '男', '13823888883', '773890003@qq.com', '440300199303030003', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian3.jpg', '地址3'),
	(24, '2021-03-13 04:56:55', '租客4', '123456', '姓名4', '职业4', '男', '13823888884', '773890004@qq.com', '440300199404040004', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian4.jpg', '地址4'),
	(25, '2021-03-13 04:56:55', '租客5', '123456', '姓名5', '职业5', '男', '13823888885', '773890005@qq.com', '440300199505050005', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian5.jpg', '地址5'),
	(26, '2021-03-13 04:56:55', '租客6', '123456', '姓名6', '职业6', '男', '13823888886', '773890006@qq.com', '440300199606060006', 'http://localhost:8080/springboot93c4v/upload/zuke_zhaopian6.jpg', '地址6'),
	(1615611582075, '2021-03-13 04:59:42', '11', '11', '地方', '是的方法根深蒂固', '男', '11111111111', '11@qq.com', '441421100000000001', 'http://localhost:8080/springboot93c4v/upload/1615611658903.jpg', '发顺丰');

DROP TABLE IF EXISTS `zulinhetong`;
CREATE TABLE IF NOT EXISTS `zulinhetong` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hetongbianhao` varchar(200) DEFAULT NULL COMMENT '合同编号',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `fangwubianhao` varchar(200) DEFAULT NULL COMMENT '房屋编号',
  `xiangxidizhi` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `zujia` varchar(200) DEFAULT NULL COMMENT '租价',
  `zufangzhuangtai` varchar(200) DEFAULT NULL COMMENT '租房状态',
  `zulinriqi` date DEFAULT NULL COMMENT '租赁日期',
  `qiandingshijian` date DEFAULT NULL COMMENT '签订时间',
  `youxiaoqi` varchar(200) DEFAULT NULL COMMENT '有效期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hetongbianhao` (`hetongbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3 COMMENT='租赁合同';

DELETE FROM `zulinhetong`;
INSERT INTO `zulinhetong` (`id`, `addtime`, `hetongbianhao`, `zhanghao`, `xingming`, `shenfenzheng`, `shouji`, `fangwubianhao`, `xiangxidizhi`, `zujia`, `zufangzhuangtai`, `zulinriqi`, `qiandingshijian`, `youxiaoqi`) VALUES
	(61, '2021-03-13 04:56:55', '合同编号1', '账号1', '姓名1', '身份证1', '手机1', '房屋编号1', '详细地址1', '租价1', '已退租', '2021-03-13', '2021-03-13', '有效期1'),
	(62, '2021-03-13 04:56:55', '合同编号2', '账号2', '姓名2', '身份证2', '手机2', '房屋编号2', '详细地址2', '租价2', '已退租', '2021-03-13', '2021-03-13', '有效期2'),
	(63, '2021-03-13 04:56:55', '合同编号3', '账号3', '姓名3', '身份证3', '手机3', '房屋编号3', '详细地址3', '租价3', '已退租', '2021-03-13', '2021-03-13', '有效期3'),
	(64, '2021-03-13 04:56:55', '合同编号4', '账号4', '姓名4', '身份证4', '手机4', '房屋编号4', '详细地址4', '租价4', '已退租', '2021-03-13', '2021-03-13', '有效期4'),
	(65, '2021-03-13 04:56:55', '合同编号5', '账号5', '姓名5', '身份证5', '手机5', '房屋编号5', '详细地址5', '租价5', '已退租', '2021-03-13', '2021-03-13', '有效期5'),
	(66, '2021-03-13 04:56:55', '合同编号6', '账号6', '姓名6', '身份证6', '手机6', '房屋编号6', '详细地址6', '租价6', '已退租', '2021-03-13', '2021-03-13', '有效期6');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
