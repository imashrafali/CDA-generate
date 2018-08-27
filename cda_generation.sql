/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50015
Source Host           : localhost:3306
Source Database       : cda_generation

Target Server Type    : MYSQL
Target Server Version : 50015
File Encoding         : 65001

Date: 2017-05-20 11:43:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cda_file_generation`
-- ----------------------------
DROP TABLE IF EXISTS `cda_file_generation`;
CREATE TABLE `cda_file_generation` (
  `pid` varchar(255) default NULL,
  `pName` varchar(255) default NULL,
  `pEmail` varchar(255) default NULL,
  `date` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cda_file_generation
-- ----------------------------

-- ----------------------------
-- Table structure for `file_request`
-- ----------------------------
DROP TABLE IF EXISTS `file_request`;
CREATE TABLE `file_request` (
  `user_id` varchar(255) default NULL,
  `userName` varchar(255) default NULL,
  `emails` varchar(255) default NULL,
  `mobile` varchar(255) default NULL,
  `state` varchar(255) default NULL,
  `country` varchar(255) default NULL,
  `pid` varchar(255) default NULL,
  `pName` varchar(255) default NULL,
  `pEmail` varchar(255) default NULL,
  `date` varchar(255) default NULL,
  `utype` varchar(255) default NULL,
  `pids` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of file_request
-- ----------------------------

-- ----------------------------
-- Table structure for `hosp_file_request`
-- ----------------------------
DROP TABLE IF EXISTS `hosp_file_request`;
CREATE TABLE `hosp_file_request` (
  `pid` varchar(255) default NULL,
  `pName` varchar(255) default NULL,
  `pEmail` varchar(255) default NULL,
  `date` varchar(255) default NULL,
  `hospital` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hosp_file_request
-- ----------------------------
INSERT INTO `hosp_file_request` VALUES ('PA-0998', 'Raju', 'raju@gmail.com', '2017-05-20', 'HospitalA');
INSERT INTO `hosp_file_request` VALUES ('PA-0998', 'Raju', 'raju@gmail.com', '2017-05-20', 'HospitalB');
INSERT INTO `hosp_file_request` VALUES ('PA-09373', 'golu', 'gopi@gmail.com', '2017-05-10', 'HospitalA');
INSERT INTO `hosp_file_request` VALUES ('PA-099845', 'Gopi', 'gopi@gmail.com', '2017-05-04', 'HospitalB');

-- ----------------------------
-- Table structure for `login_details`
-- ----------------------------
DROP TABLE IF EXISTS `login_details`;
CREATE TABLE `login_details` (
  `pEmail` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `utype` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of login_details
-- ----------------------------
INSERT INTO `login_details` VALUES ('Admin', '123', 'Admin');
INSERT INTO `login_details` VALUES ('Cloud', '123', 'Cloud');
INSERT INTO `login_details` VALUES ('physician ', '123', 'Physician');
INSERT INTO `login_details` VALUES ('User', '123', 'User');
INSERT INTO `login_details` VALUES ('HospitalA', '123', 'HospitalA');
INSERT INTO `login_details` VALUES ('HospitalB', '123', 'HospitalB');
INSERT INTO `login_details` VALUES ('raviprakashsingh146@gmail.com', '123', 'Physician');
INSERT INTO `login_details` VALUES ('rvcv1992@gmail.com', '123', 'User');
INSERT INTO `login_details` VALUES ('gbsahana.999@gmail.com', '123', 'Physician');
INSERT INTO `login_details` VALUES ('vinayasingh55@gmail.com', '123', 'Physician');
INSERT INTO `login_details` VALUES ('95lavanyanmurthy@gmail.com', '123', 'User');

-- ----------------------------
-- Table structure for `patient_info`
-- ----------------------------
DROP TABLE IF EXISTS `patient_info`;
CREATE TABLE `patient_info` (
  `pid` varchar(255) default NULL,
  `pName` varchar(255) default NULL,
  `Gender` varchar(255) default NULL,
  `pAge` varchar(255) default NULL,
  `date` varchar(255) default NULL,
  `pEmail` varchar(255) default NULL,
  `did` varchar(255) default NULL,
  `docName` varchar(255) default NULL,
  `Information` varchar(255) default NULL,
  `Resion` varchar(255) default NULL,
  `Medications` varchar(255) default NULL,
  `immunization` varchar(255) default NULL,
  `Problem` varchar(255) default NULL,
  `FamilyHistory` varchar(255) default NULL,
  `SocialHistory` varchar(255) default NULL,
  `Allergies` varchar(255) default NULL,
  `MedicalEquipment` varchar(255) default NULL,
  `VitalSigns` varchar(255) default NULL,
  `Results` varchar(255) default NULL,
  `Procedures` varchar(255) default NULL,
  `Encounter` varchar(255) default NULL,
  `Planofcare` varchar(255) default NULL,
  `hospital` varchar(255) default NULL,
  `authKey` varchar(255) default NULL,
  `email` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of patient_info
-- ----------------------------
INSERT INTO `patient_info` VALUES ('PA-0998', 'Raju', 'male', '34', '2017-05-20', 'raju@gmail.com', 'DO-9803', 'rajveer', 'suffering from cold cuff', 'cold cuff', 'cipla', 'simple medicene', 'pain', 'good', 'good', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'hospitalA', '123505', 'raviprakashsingh146@gmail.com');
INSERT INTO `patient_info` VALUES ('PA-09983', 'Raju', 'male', '45', '2017-05-21', 'raju@gmail.com', 'DO-9803', 'Rajiv', 'suffering from cold cuff', 'cold cuff', 'cipla', 'simple medicene', 'pain', 'good', 'good', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'hospitalB', 'Not Required', 'rvcv1992@gmail.com');
INSERT INTO `patient_info` VALUES ('PA-09373', 'golu', 'male', '34', '2017-05-10', 'gopi@gmail.com', 'DA-9845', 'rajveerkr', 'suffering from cold cuff', 'cold cuff', 'cipla, some other medicine', 'simple medicene', 'pain', 'good', 'good', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'hospitalA', '618774', 'raviprakashsingh146@gmail.com');
INSERT INTO `patient_info` VALUES ('PA-099845', 'Gopi', 'male', '45', '2017-05-04', 'gopi@gmail.com', 'DA-9845', 'Rajiv', 'suffering from cold cuff', 'cold cuff', 'cipla, some other medicine', 'simple medicene', 'pain', 'good', 'good', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'aabcdef', 'hospitalB', 'Not Required', 'rvcv1992@gmail.com');

-- ----------------------------
-- Table structure for `registration_details`
-- ----------------------------
DROP TABLE IF EXISTS `registration_details`;
CREATE TABLE `registration_details` (
  `user_id` varchar(255) default NULL,
  `userName` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `pEmail` varchar(255) default NULL,
  `mobile` varchar(255) default NULL,
  `state` varchar(255) default NULL,
  `country` varchar(255) default NULL,
  `utype` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of registration_details
-- ----------------------------
INSERT INTO `registration_details` VALUES ('DA-6587', 'ravi', '123', 'raviprakashsingh146@gmail.com', '1234567890', 'karnataka', 'india', 'Physician');
INSERT INTO `registration_details` VALUES ('PA-09983', 'raju', '123', 'rvcv1992@gmail.com', '1234567890', 'karnataka', 'india', 'User');
INSERT INTO `registration_details` VALUES ('DA-658744', 'rajveersr', '123', 'gbsahana.999@gmail.com', '1234567890', 'karnataka', 'india', 'Physician');
INSERT INTO `registration_details` VALUES ('PA-0998333', 'ranjab', '123', 'vinayasingh55@gmail.com', '1234567890', 'karnataka', 'india', 'Physician');
INSERT INTO `registration_details` VALUES ('PA-562144', 'raghuss', '123', '95lavanyanmurthy@gmail.com', '1234567890', 'karnataka', 'india', 'User');
