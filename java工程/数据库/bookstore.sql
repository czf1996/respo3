/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50045
Source Host           : localhost:3306
Source Database       : bookstore

Target Server Type    : MYSQL
Target Server Version : 50045
File Encoding         : 65001

Date: 2019-11-29 15:31:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(20) NOT NULL auto_increment,
  `aname` varchar(255) default NULL,
  `aaccount` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '程子丰3', '18856633801', '123456');
INSERT INTO `admin` VALUES ('4', '程子丰', '18856633800', 'czf123');

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(20) NOT NULL auto_increment,
  `bname` varchar(255) default NULL,
  `bprivce` double(10,0) default NULL,
  `bphoto` varchar(255) default NULL,
  `flag` int(20) default NULL,
  `bnumber` int(20) default NULL,
  `bauthor` varchar(255) default NULL,
  `bpress` varchar(255) default NULL,
  `bdescribe` varchar(255) default NULL,
  `bdate` varchar(255) default NULL,
  `cid` int(20) default NULL,
  PRIMARY KEY  (`id`),
  KEY `cid` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('8', '音乐与情感', '39', '/pic/f7a01a4d-7d65-4f29-a3d9-8c6f7cffc16b.jpg', '1', '10', '(美)查尔斯·罗森', '浙江大学', '很好的一本书', '2012-12-02', '7');
INSERT INTO `book` VALUES ('9', ' 布伦德尔谈钢琴(原版引进)(精) ', '50', '/pic/3922787-fm.jpg@!w210.jpg', '1', '100', '阿尔弗雷德·布伦德尔', '上海音乐 ', '很好的一本书', '2014-10-25', '7');
INSERT INTO `book` VALUES ('10', '穿T恤听古典音乐--巨匠时代(精)', '34', '/pic/8bbd7dd6-1a23-495e-9cb2-9149466a8c97.jpg', '1', '100', '田艺苗', '云南美术', '', '2012-12-02', '7');
INSERT INTO `book` VALUES ('11', '与小泽征尔共度的午后音乐时光(精) ', '39', '/pic/1d992553-075d-4de0-9aba-17d8be814ede.jpg', '1', '100', '(日)小泽征尔//村上春树', '人民音乐 ', '很好的一本书', '2015-01-10', '7');
INSERT INTO `book` VALUES ('12', '乐评人自我修养(精)', '60', '/pic/1359b27a-8991-449c-85d5-f4f83e0b148b.jpg', '1', '200', '(奥)爱德华·汉斯立克', '华中科技大学', '', '2015-10-30', '7');
INSERT INTO `book` VALUES ('13', '欢娱的巅峰--唐代教坊考(精)', '45', '/pic/a8dc32b9-5647-4e8e-8921-9e8ea9a91906.jpg', '1', '500', '(加拿大)王立|总主编:王晓纯//吴晚云', '新星', ' 王立著的《欢娱的**--唐代教坊考(精)》对唐代乐艺机构的建制进行了系统梳理，书中还介绍了分布于各藩镇的 官伎及长安市井伎的形成与发展……', '2012-12-02', '7');
INSERT INTO `book` VALUES ('14', '德奥名人论音乐和音乐美 ', '128', '/pic/d91bb76a-cbca-4451-aa18-e02a7bec0b34.jpg', '1', '0', '编者:(德)费利克斯·玛丽亚·伽茨...', '人民音乐', '', '2012-12-02', '7');
INSERT INTO `book` VALUES ('15', '古典风格(海顿莫扎特贝多芬修订版)(精)', '50', '/pic/bcd1ff45-d0a7-4757-99b2-a7060eeaef24.jpg', '1', '86', '(美)查尔斯·罗森|译者:杨燕迪', '华东师大 ', '近五十年以来**的影响力、引用率方面“无有比肩者”的西方经典音乐论著', '2010-02-20', '7');
INSERT INTO `book` VALUES ('16', '律吕精义(精)/中国古代音乐文献丛刊 ', '130', '/pic/d7e57df0-a005-4efa-b1ff-27196e329dde.jpg', '1', '10', '(明)朱载堉|校注:冯文慈 ', '人民音乐', '', '2012-02-29', '7');
INSERT INTO `book` VALUES ('17', '论巴赫(精)/六点音乐译丛 ', '188', '/pic/c5d7d8e2-1341-44f1-ab73-1141ee8d6f8f.jpg', '1', '200', '(德)阿尔伯特·施韦泽|总主编:杨燕迪|译者:何源//陈广琛', '华东师大 ', '', '2005-10-02', '7');

-- ----------------------------
-- Table structure for `cartitem`
-- ----------------------------
DROP TABLE IF EXISTS `cartitem`;
CREATE TABLE `cartitem` (
  `id` int(20) NOT NULL auto_increment,
  `productId` int(20) default NULL,
  `number` int(20) default NULL,
  `price` double(20,0) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cartitem
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(20) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('6', '历史类书籍');
INSERT INTO `category` VALUES ('7', '音乐类书籍');
INSERT INTO `category` VALUES ('8', '小说类书籍');
INSERT INTO `category` VALUES ('9', '诗文类书籍');
INSERT INTO `category` VALUES ('10', '书画类书籍');

-- ----------------------------
-- Table structure for `orderitem`
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(20) NOT NULL auto_increment,
  ` productId` int(20) default NULL,
  `orderId` int(20) default NULL,
  `number` int(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------

-- ----------------------------
-- Table structure for `orderno`
-- ----------------------------
DROP TABLE IF EXISTS `orderno`;
CREATE TABLE `orderno` (
  `id` int(20) NOT NULL auto_increment,
  `ono` varchar(255) default NULL,
  `otime` date default NULL,
  `opay` double(20,0) default NULL,
  `oderlivery` date default NULL,
  `oallprice` double(20,0) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderno
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL auto_increment,
  `uname` varchar(255) default NULL,
  `uaccount` varchar(255) default NULL,
  `upassword` varchar(255) default NULL,
  `uaddress` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6', '程子丰', '18856633800', 'czf123', '安徽新华学院');
INSERT INTO `user` VALUES ('11', '李亚', '1888564612', 'ly123', '安徽新华学院');
INSERT INTO `user` VALUES ('12', '张三', '123545646', 'vcd12', '成为单位');
