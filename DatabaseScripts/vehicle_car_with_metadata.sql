CREATE DATABASE  IF NOT EXISTS `vehicle` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `vehicle`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: vehicle
-- ------------------------------------------------------
-- Server version	5.5.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

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