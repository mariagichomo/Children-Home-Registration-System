-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2021 at 11:14 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `child`
--

-- --------------------------------------------------------

--
-- Table structure for table `donation`
--

CREATE TABLE `donation` (
  `id` int(10) NOT NULL,
  `First Name` varchar(15) NOT NULL,
  `Surname` varchar(15) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Donation` varchar(15) NOT NULL,
  `Quantity` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donation`
--

INSERT INTO `donation` (`id`, `First Name`, `Surname`, `Email`, `Telephone`, `Donation`, `Quantity`) VALUES
(1, 'Mercy', 'Njeri', 'mercy@gmail.com', '0716168026', 'Clothes', '2kg'),
(2, 'Faith', 'Wanjiku', 'faith@gmail.com', '0727534847', 'books', '10 books'),
(3, 'derrick', 'kamau', 'derrick@gmail.com', '0716168096', 'pens', '10'),
(4, 'Maria', 'Wanjiku', 'maria@gmail.com', '0716168026', 'Rice', '10 bags');

-- --------------------------------------------------------

--
-- Table structure for table `occupants`
--

CREATE TABLE `occupants` (
  `id` int(11) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Age` int(11) NOT NULL,
  `Location` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `occupants`
--

INSERT INTO `occupants` (`id`, `Name`, `Gender`, `Age`, `Location`) VALUES
(1, 'Sharon Wambui', 'Female', 20, 'Nairobi'),
(19, 'Clinton', 'Male', 19, 'Mombasa'),
(20, 'John Maina', 'Male', 14, 'Naivasha'),
(21, 'Mercy', 'Female', 14, 'Naivasha'),
(22, 'Simon', 'Male', 20, 'Nakuru'),
(23, 'Christine', 'Female', 10, 'Nakuru'),
(24, 'Sharon', 'Female', 13, 'Naivasha'),
(25, 'john', 'Male', 5, 'Nairobi'),
(26, 'kelvin', 'Male', 13, 'Nairobi'),
(27, 'peter', 'Male', 12, 'Nairobi'),
(28, 'Joan', 'Female', 14, 'Nairobi'),
(29, 'Peace', 'Female', 12, 'Mombasa'),
(30, 'simon', 'Male', 12, 'Mombasa'),
(31, 'mike', 'Male', 13, 'Nakuru'),
(32, 'GEORGE', 'Male', 12, 'Nairobi'),
(33, 'Susan', 'Female', 13, 'null'),
(34, 'Susan', 'Female', 13, 'Nairobi'),
(35, 'Sylvia', 'Female', 20, 'Mombasa'),
(36, 'Kelvin', 'Female', 20, 'Mombasa');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `id` int(11) NOT NULL,
  `First Name` varchar(11) NOT NULL,
  `Second Name` varchar(11) NOT NULL,
  `Gender` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`id`, `First Name`, `Second Name`, `Gender`) VALUES
(1, 'sdfg', 'sdfgh', 'Male'),
(2, 'sdfg', 'sdfgh', 'Male'),
(3, 'Maria', 'Gichomo', 'Female'),
(4, 'Serena', 'Nduta', 'Female'),
(5, 'Jane', 'Martha', 'Female'),
(6, 'Jane', 'Martha', 'Female'),
(7, 'David', 'Nganga', 'Male'),
(8, 'rty', 'dfg', 'Male'),
(9, 'Maria', 'Wairimu', 'Female'),
(10, 'Sandra', 'Wanjiku', 'Female'),
(11, 'peter', 'kamau', 'Male'),
(12, '', '', 'null'),
(13, 'ertyu', 'dfghj', 'Male'),
(14, 'fghj', 'dfgh', 'Male'),
(15, 'wert', 'dfgh', 'Male'),
(26, 'dfgh', 'fgh', 'Male'),
(27, 'george', 'kamau', 'Male'),
(28, 'Ann', 'Wambui', 'Female'),
(29, 'Hannah', 'Karimi', 'Female'),
(30, 'Clinton', 'mugere', 'Male'),
(31, 'rose', 'wambui', 'Female'),
(36, 'John', 'Mbugua', 'Male'),
(37, 'Maria', 'Wanjiku', 'Female'),
(38, '', '', 'null'),
(39, 'Jane', 'Mugo', 'Female'),
(40, 'hanna', 'wambui', 'Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donation`
--
ALTER TABLE `donation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `occupants`
--
ALTER TABLE `occupants`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donation`
--
ALTER TABLE `donation`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `occupants`
--
ALTER TABLE `occupants`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
