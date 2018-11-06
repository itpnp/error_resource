-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 06, 2018 at 01:23 
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `reward`
--

-- --------------------------------------------------------

--
-- Table structure for table `credential`
--

CREATE TABLE IF NOT EXISTS `credential` (
  `id_akses` int(11) NOT NULL AUTO_INCREMENT,
  `hak_akses` enum('SISTEM','HR/IS','KABAG','SEKRETARIAT','PLANT MANAGER','SUPER ADMIN','REWARD') DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `last_login` date DEFAULT NULL,
  `id_karyawan` varchar(100) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_akses`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `credential`
--

INSERT INTO `credential` (`id_akses`, `hak_akses`, `username`, `password`, `last_login`, `id_karyawan`, `status`) VALUES
(1, 'SUPER ADMIN', 'itholo', '45e1e2fcdaf4a4f031df9174431199a9', NULL, '93742', '1'),
(13, 'REWARD', 'ivana_d', '3fc0a7acf087f549ac2b266baf94b8b1', NULL, '93661', '1'),
(15, 'SUPER ADMIN', 'erwin', '785f0b13d4daf8eee0d11195f58302a4', NULL, '93980', '1'),
(16, 'SISTEM', 'is', '827ccb0eea8a706c4c34a16891f84e7b', NULL, '10184', '1'),
(24, 'SISTEM', 'diana', '3a23bb515e06d0e944ff916e79a7775c', '2018-10-05', '06801', '1'),
(25, 'SISTEM', 'susah', '827ccb0eea8a706c4c34a16891f84e7b', NULL, '07854	', '0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
