-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2024 at 08:09 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `ID` int(11) NOT NULL,
  `name` varchar(127) NOT NULL,
  `first_name` varchar(127) NOT NULL,
  `mid_name` varchar(127) NOT NULL,
  `last_name` varchar(127) NOT NULL,
  `mobile_number` varchar(127) NOT NULL,
  `age` varchar(127) NOT NULL,
  `gender` varchar(127) NOT NULL,
  `emergency_contact_name` varchar(127) NOT NULL,
  `emergency_first_name` varchar(127) NOT NULL,
  `emergency_last_name` varchar(127) NOT NULL,
  `emergency_contact_number` varchar(127) NOT NULL,
  `plan` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`ID`, `name`, `first_name`, `mid_name`, `last_name`, `mobile_number`, `age`, `gender`, `emergency_contact_name`, `emergency_first_name`, `emergency_last_name`, `emergency_contact_number`, `plan`) VALUES
(1, 'Rain C Rey', 'Rain', 'C', 'Rey', '09368717064', '19', 'Male', 'RainRey', 'Rain', 'Rey', '09368717064', 'Half-Month'),
(2, 'Xavier Ng', 'Xavier', 'N/A', 'Ng', '09808989089', '20', 'Male', 'RainRey', 'Rain', 'Rey', '09368717064', 'Monthly');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `ID` int(11) NOT NULL,
  `amount` varchar(127) NOT NULL,
  `date_paid` varchar(127) NOT NULL,
  `date_expiration` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`ID`, `amount`, `date_paid`, `date_expiration`) VALUES
(1, '700', '2024-06-25', '2024-07-25');

-- --------------------------------------------------------

--
-- Table structure for table `time`
--

CREATE TABLE `time` (
  `member_id` varchar(127) NOT NULL,
  `member_name` varchar(127) NOT NULL,
  `date` varchar(127) NOT NULL,
  `time_in` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `time`
--

INSERT INTO `time` (`member_id`, `member_name`, `date`, `time_in`) VALUES
('1', 'Rain C Rey', '2024-06-25', '13:32:12'),
('2', 'Xavier Ng', '2024-06-25', '13:59:56'),
('2', 'Xavier Ng', '2024-06-25', '14:02:43');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
