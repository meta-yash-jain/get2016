CREATE DATABASE  IF NOT EXISTS `vehicle`;

USE `vehicle`;

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `ID` char(36) NOT NULL,
  `CompanyName` varchar(100) NOT NULL,
  `ModelNumber` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `FuelCapacity` decimal(9,2) NOT NULL,
  `Milege` decimal(9,2) NOT NULL,
  `Price` decimal(9,2) NOT NULL,
  `RoadTax` decimal(9,2) NOT NULL,
  `AC` tinyint(1) NOT NULL,
  `PowerSteering` tinyint(1) NOT NULL,
  `AccessoryKit` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `car` WRITE;

INSERT INTO `car` VALUES ('01a46cda-c97e-47aa-8923-1c4761c329b3','Tata','T123','Jaguar',987.00,123.00,123483.00,89.00,1,0,1),('0387f7f5-29cd-492a-8fd2-474b718511e9','BMW','BMW12','BMW-Dream-Fantasy',200.00,80.00,88000.00,89.00,1,0,1),('0af4a624-5759-456a-acfc-08888f2d8943','Tata','T120','Indica',100.00,90.00,90.00,90.00,1,0,1),('4d58d9d5-7709-46aa-b6bb-5b9e0b14af15','Maruti ','M1234','Maruti 800',70.00,80.00,9000000.00,90.00,0,1,0),('581ffef5-ff0f-4acb-8a1d-c5fb972e4f17','Maruti ','M123','Maruti',80.00,70.00,900000.00,10.00,1,1,1),('67613ea8-921a-4295-ba96-510a93685536','Mercedes','ME124','Benz',100.00,80.00,780000.00,8.00,1,1,1),('b2c0b2c8-f620-416e-badb-05fa28bb2695','Mercedes','M345','Benz-2',85.00,56.00,200000.00,90.00,0,1,1);

UNLOCK TABLES;
