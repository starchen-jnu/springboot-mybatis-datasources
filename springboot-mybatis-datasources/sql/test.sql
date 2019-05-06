/*
Navicat MySQL Data Transfer

Source Server         : 192.168.178.129
Source Server Version : 50725
Source Host           : 192.168.178.129:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-05-06 11:07:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', 'star', '123', '26', 'student');
INSERT INTO `member` VALUES ('493', 'zhangsan', '123', '21', 'student');
INSERT INTO `member` VALUES ('560', 'zhangsan', '123', '21', 'student');
INSERT INTO `member` VALUES ('882', 'zhangsan', '123', '21', 'student');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(36) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL DEFAULT '',
  `user_name` varchar(50) DEFAULT NULL,
  `user_age` varchar(50) DEFAULT NULL,
  `department_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
