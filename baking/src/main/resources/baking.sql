/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.5.18-MariaDB : Database - baking
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`baking` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;

USE `baking`;

/*Table structure for table `t_banner` */

DROP TABLE IF EXISTS `t_banner`;

CREATE TABLE `t_banner` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) DEFAULT NULL,
  `sort` int(11) NOT NULL COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='编码表';

/*Data for the table `t_banner` */

insert  into `t_banner`(`id`,`img_url`,`sort`,`create_time`) values 
(1,'/imgs/banner1.jpg',1,'2023-02-08 14:29:44'),
(2,'/imgs/banner2.jpg',2,'2023-02-08 14:29:44'),
(3,'/imgs/banner3.jpg',3,'2023-02-08 14:29:44');

/*Table structure for table `t_category` */

DROP TABLE IF EXISTS `t_category`;

CREATE TABLE `t_category` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '类别名',
  `level` int(11) NOT NULL COMMENT '级别',
  `parent_id` int(11) NOT NULL COMMENT '父类级别',
  `type` int(11) NOT NULL COMMENT '类型',
  `sort` int(11) NOT NULL COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='类别表';

/*Data for the table `t_category` */

insert  into `t_category`(`id`,`name`,`level`,`parent_id`,`type`,`sort`,`create_time`) values 
(1,'烘培食谱',1,0,1,1,'2023-02-07 13:39:05'),
(2,'面包',2,1,1,1,'2023-02-07 13:39:05'),
(3,'家常菜',2,1,1,2,'2023-02-07 13:39:05'),
(4,'小食',2,1,1,3,'2023-02-07 13:39:05'),
(5,'烘培视频',1,0,2,2,'2023-02-07 13:39:05'),
(6,'家常菜教学',2,5,2,1,'2023-02-07 13:39:05'),
(7,'美食欣赏',2,5,2,2,'2023-02-07 13:39:05'),
(8,'资讯',1,0,3,1,'2023-02-07 13:39:05'),
(9,'美食资讯',2,8,3,1,'2023-02-07 13:39:05'),
(10,'店家资讯',2,8,3,2,'2023-02-07 13:39:05');

/*Table structure for table `t_comment` */

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL COMMENT '评论内容',
  `user_id` bigint(11) NOT NULL COMMENT '评论用户ID',
  `content_id` int(11) NOT NULL COMMENT '评论内容ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='评论表';


/*Table structure for table `t_content` */

DROP TABLE IF EXISTS `t_content`;

CREATE TABLE `t_content` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '标题',
  `img_url` varchar(64) NOT NULL COMMENT '封面图片地址',
  `video_url` varchar(64) DEFAULT NULL COMMENT '视频地址',
  `content` text DEFAULT NULL COMMENT '内容html样式',
  `type` bigint(11) NOT NULL COMMENT '一级类型(视频/食谱/资讯）',
  `view_count` int(11) DEFAULT 0 COMMENT '浏览量',
  `comment_count` int(11) DEFAULT 0 COMMENT '评论量',
  `create_by` bigint(11) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_by` bigint(11) DEFAULT NULL COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `brief` varchar(255) DEFAULT NULL,
  `category_id` bigint(11) DEFAULT NULL COMMENT '发布的二级类别(面包小食)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='内容表';

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `nickname` varchar(255) NOT NULL COMMENT '昵称',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `is_admin` int(11) DEFAULT NULL COMMENT '是否是管理员',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `img_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `un_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
