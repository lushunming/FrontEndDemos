
# MybatisAndSpring

建表sql

/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-01-05 23:10:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('2', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('3', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('4', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('5', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('6', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('7', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('8', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('9', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('10', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('11', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('12', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('13', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('14', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('15', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('16', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('17', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('18', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('19', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('20', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('21', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('22', 'summer', '100', 'shanghai,pudong');

