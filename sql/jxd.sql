/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : jxd

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-05-19 17:43:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_cost`
-- ----------------------------
DROP TABLE IF EXISTS `t_cost`;
CREATE TABLE `t_cost` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cardno` int(10) NOT NULL COMMENT '卡号',
  `date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '消费日期',
  `weight` double DEFAULT NULL COMMENT '重量kg',
  `typeid` int(10) DEFAULT NULL COMMENT '消费种类',
  `cost` double(10,0) DEFAULT NULL COMMENT '消费金额',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cost
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `cardno` varchar(20) NOT NULL COMMENT '卡号',
  `name` varchar(50) DEFAULT '' COMMENT '姓名',
  `birthdate` varchar(20) DEFAULT NULL COMMENT '生日',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话',
  `gender` int(1) DEFAULT '0' COMMENT '性别0男，1女',
  `crtdate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member
-- ----------------------------
INSERT INTO `t_member` VALUES ('1014', 'JXD20180519173616', '客户1', '1990-10-10', '13912345678', '0', '2018-05-19 17:36:16', '朋友介绍');

-- ----------------------------
-- Table structure for `t_renew`
-- ----------------------------
DROP TABLE IF EXISTS `t_renew`;
CREATE TABLE `t_renew` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cardno` varchar(20) DEFAULT NULL,
  `amount` double(10,0) DEFAULT NULL COMMENT '续费金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_renew
-- ----------------------------

-- ----------------------------
-- Table structure for `t_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '类型名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', '商品1');
INSERT INTO `t_type` VALUES ('2', '商品2');
INSERT INTO `t_type` VALUES ('3', '商品3');
INSERT INTO `t_type` VALUES ('4', '商品4');
INSERT INTO `t_type` VALUES ('5', '商品5');
INSERT INTO `t_type` VALUES ('6', '商品6');
INSERT INTO `t_type` VALUES ('7', '商品7');

-- ----------------------------
-- Table structure for `t_unitprice`
-- ----------------------------
DROP TABLE IF EXISTS `t_unitprice`;
CREATE TABLE `t_unitprice` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cardno` varchar(20) NOT NULL COMMENT '卡号',
  `typeid` int(10) DEFAULT NULL COMMENT '类型',
  `unitprice` double(10,0) DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_unitprice
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'robin', '123456', '13940598389');
