-- ----------------------------
-- 创建数据库，注意中文兼容
-- ----------------------------
create database testdb default character set utf8mb4 collate utf8mb4_unicode_ci;

use testdb;

-- ----------------------------
-- 创建雇员表
-- ----------------------------
DROP TABLE IF EXISTS `tb_emp`;
CREATE TABLE `tb_emp` (
                          `id` varchar(50) NOT NULL,
                          `name` varchar(50) NOT NULL,
                          `salary` double DEFAULT NULL,
                          `age` int(3) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 添加测试数据
-- ----------------------------
INSERT INTO `tb_emp` VALUES ('a00001', '关羽', '2000', '30');
INSERT INTO `tb_emp` VALUES ('a00002', '张飞', '2100', '31');
INSERT INTO `tb_emp` VALUES ('a00004', '赵云', '3000', '31');

select * from `tb_emp`;

-- ----------------------------
-- 创建用户表
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
                           `id` varchar(50) NOT NULL,
                           `username` varchar(50) NOT NULL,
                           `realname` varchar(50) NOT NULL,
                           `password` varchar(50) NOT NULL,
                           `gender` char(10) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 添加用户数据
-- ----------------------------
INSERT INTO `tb_user` VALUES ('6b448c7c-e8d2-460b-8ffd-10754e6d143a', 'jtzheng', '郑洁姚', '123456', '女');
INSERT INTO `tb_user` VALUES ('d137cc7d-9a04-4fba-ab1c-a75a3041c12d', 'fhzheng', '郑丰华', '123456', '男');

select * from `tb_user`;
