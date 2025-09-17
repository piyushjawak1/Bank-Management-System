-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 17, 2025 at 05:04 AM
-- Server version: 9.1.0
-- PHP Version: 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE IF NOT EXISTS `accounts` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `account_number` varchar(20) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_number` (`account_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`id`, `name`, `contact`, `address`, `account_number`, `balance`) VALUES
(10, 'Om Jawak', '8695152635', 'Ahilyanagar', '7861249232', 99600),
(1, 'Piyush Jawak', '8767988048', 'Solapur', '35789215624', 105000),
(2, 'Saniya Kamble', '9865478598', 'Kopargoan', '75469821456', 380),
(3, 'Sandhya', '8830119974', 'Ahilyanagar', '632541748596', 80000),
(66, 'Sam', '9632587412', 'karve nagar', '9856321478', 40000),
(87, 'ahilya', '9874563258', 'pune', '789654123321', 6000),
(65, 'omkar', '9856985689', 'pune', '9874563212233', 60000),
(33, '11', '7854123698', 'Kamal Nagar', '987456958674', 51000),
(55, 'Lila ', '9856478569', 'Mumbai', '785496321456', 40000),
(22, 'Sayali', '8767988048', 'Kurla', '963258741258', 50000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
