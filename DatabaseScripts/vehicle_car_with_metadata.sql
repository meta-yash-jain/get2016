CREATE DATABASE  IF NOT EXISTS `vehicle`;
USE `vehicle`;

CREATE TABLE `car_with_metadata` (
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
  `CreatedBy` varchar(200) NOT NULL,
  `CreatedTime` DATETIME NOT NULL,
  `UpdatedBy` varchar(200) NOT NULL,
  `UpdatedTime` DATETIME NOT NULL,
  
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
