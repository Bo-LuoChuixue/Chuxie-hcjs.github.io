-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.5.16-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 导出 blog 的数据库结构
CREATE DATABASE IF NOT EXISTS `baking` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `baking`;

-- 导出  表 blog.comment 结构
CREATE TABLE IF NOT EXISTS `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `user_id` bigint(20) DEFAULT NULL,
  `weibo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=312 DEFAULT CHARSET=utf8;

-- 正在导出表  blog.comment 的数据：~11 rows (大约)
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` (`id`, `content`, `created`, `user_id`, `weibo_id`) VALUES
	(300, 'lucy对第1条微博的评论', '2008-01-01 00:00:00', 100, 200),
	(301, 'tom对第1条微博的评论', '2008-01-01 00:00:00', 101, 200),
	(302, 'lucy对第2条微博的评论', '2008-01-01 00:00:00', 100, 201),
	(303, 'tom对第2条微博的评论', '2008-01-01 00:00:00', 101, 201),
	(304, 'jim对第2条微博的评论', '2008-01-01 00:00:00', 102, 201),
	(305, '长亭外，古道边，芳草碧连天', '2023-10-30 14:28:16', 100, 200),
	(306, 'https://news.ifeng.com/special/0512earthquake/rollnews/200805/0519_3410_548504.shtml', '2023-10-30 15:56:30', 103, 205),
	(307, '中国人民是勇敢坚毅的民族，历史上我们经历了许多困难和挑战，但每一次都能够奋起直追，战胜困难。我们有着强大的凝聚力和团结力量，能够共同应对各种困难。无论是自然灾害、经济危机还是疾病疫情，中国人民总能够团结一心，共同努力，最终战胜困难。', '2023-10-30 14:59:56', 100, 205),
	(309, '你也看《巴啦啦小魔仙》吗', '2023-10-30 15:40:56', 103, 207),
	(310, '你看巴啦啦小魔仙吗', '2023-11-17 10:38:50', 103, 207),
	(311, '我也是，困死了', '2023-11-17 11:11:55', 117, 208);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;

-- 导出  表 blog.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

-- 正在导出表  blog.user 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `nickname`, `created`) VALUES
	(100, 'Lucy', '123456', 'lucy', '1987-10-16 00:00:00'),
	(101, 'Tom', '123456', 'tom', '1987-10-16 00:00:00'),
	(102, 'Jim', '123456', 'jim', '1987-10-16 00:00:00'),
	(103, '李知恩', '19930516', 'IU', '2023-10-30 14:51:42'),
	(105, '橙留香', '123456', '橙留香', '2023-10-30 16:39:45'),
	(117, '裴珠泫', '19910329', 'Irene', '2023-11-17 11:11:07');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- 导出  表 blog.weibo 结构
CREATE TABLE IF NOT EXISTS `weibo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=209 DEFAULT CHARSET=utf8;

-- 正在导出表  blog.weibo 的数据：~8 rows (大约)
/*!40000 ALTER TABLE `weibo` DISABLE KEYS */;
INSERT INTO `weibo` (`id`, `content`, `created`, `user_id`) VALUES
	(200, 'lucy的第1条微博', '2000-01-01 00:00:00', 100),
	(201, 'lucy的第2条微博', '2000-01-01 00:00:00', 100),
	(202, 'tom的第1条微博', '2000-01-01 00:00:00', 101),
	(203, 'tom的第2条微博', '2000-01-01 00:00:00', 101),
	(204, 'tom的第3条微博', '2000-01-01 00:00:00', 101),
	(205, '我坚信任何困难都难不倒英雄的中国人民！', '2023-10-30 09:59:54', 100),
	(207, '一看到巧克力\n特别是草莓的\n我知道我无能为力', '2023-10-30 15:06:24', 100),
	(208, '好睏啊！想睡覺！', '2023-11-17 11:09:27', 103);
/*!40000 ALTER TABLE `weibo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
