CREATE DATABASE  IF NOT EXISTS `moviedb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `moviedb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: moviedb
-- ------------------------------------------------------
-- Server version	5.6.37

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
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendance` (
  `MeetingDate` date DEFAULT NULL,
  `Location` varchar(200) DEFAULT NULL,
  `MemberAttended` char(1) DEFAULT NULL,
  `MemberId` int(11) DEFAULT NULL,
  `LocationId` int(11) DEFAULT NULL,
  KEY `LocationID_idx` (`LocationId`),
  KEY `member_fk_idx` (`MemberId`),
  CONSTRAINT `locationid_fk` FOREIGN KEY (`LocationId`) REFERENCES `location` (`LocationId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `member_fk` FOREIGN KEY (`MemberId`) REFERENCES `memberdetails` (`MemberId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES ('2004-01-01',NULL,'Y',1,2),('2004-01-01',NULL,'N',2,2),('2004-01-01',NULL,'Y',3,2),('2004-01-01',NULL,'N',4,2),('2004-01-01',NULL,'Y',5,2),('2004-01-01',NULL,'Y',6,2),('2004-03-01',NULL,'Y',1,1),('2004-03-01',NULL,'N',2,1),('2004-03-01',NULL,'Y',3,1),('2004-03-01',NULL,'Y',4,1),('2004-03-01',NULL,'N',5,1),('2004-03-01',NULL,'N',6,1);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `CategoryId` int(11) NOT NULL,
  `Category` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Thriller'),(2,'Romance'),(3,'Horror'),(4,'War'),(5,'Sci-fi'),(6,'Historical'),(7,'Comedy'),(9,'Film Noir');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favcategory`
--

DROP TABLE IF EXISTS `favcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favcategory` (
  `CategoryId` int(11) NOT NULL,
  `MemberId` int(11) NOT NULL,
  KEY `memberid_fk_idx` (`MemberId`),
  KEY `categoryid_fk_idx` (`CategoryId`),
  CONSTRAINT `categoryid_fkey` FOREIGN KEY (`CategoryId`) REFERENCES `category` (`CategoryId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `memberid_fk` FOREIGN KEY (`MemberId`) REFERENCES `memberdetails` (`MemberId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favcategory`
--

LOCK TABLES `favcategory` WRITE;
/*!40000 ALTER TABLE `favcategory` DISABLE KEYS */;
INSERT INTO `favcategory` VALUES (1,3),(1,5),(1,2),(1,3),(2,1),(2,3),(3,3),(4,6),(4,1),(5,2),(5,3),(5,4),(9,2),(9,3),(9,5),(7,6),(7,4);
/*!40000 ALTER TABLE `favcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `films`
--

DROP TABLE IF EXISTS `films`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `films` (
  `FilmId` int(11) NOT NULL,
  `FilmName` varchar(100) DEFAULT NULL,
  `YearReleased` int(11) DEFAULT NULL,
  `PlotSummary` text,
  `AvailableOnDVD` char(1) DEFAULT NULL,
  `Rating` int(11) DEFAULT NULL,
  `CategoryId` int(11) DEFAULT NULL,
  `DVDPrice` decimal(12,1) DEFAULT NULL,
  PRIMARY KEY (`FilmId`),
  KEY `categoryid_fk_idx` (`CategoryId`),
  CONSTRAINT `categoryid_fk` FOREIGN KEY (`CategoryId`) REFERENCES `category` (`CategoryId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films`
--

LOCK TABLES `films` WRITE;
/*!40000 ALTER TABLE `films` DISABLE KEYS */;
INSERT INTO `films` VALUES (1,'The Dirty Half Dozen',1987,'Six men go to war wearing unwashed uniforms.  The horror!','N',2,4,NULL),(2,'On Golden Puddle',1967,'A couple find love while wading through a puddle','Y',4,2,13.0),(3,'The Lion, the Witch, and the Chest of Drawers',1977,'A fun film for all those interested in zoo/magic/furniture drama','N',1,3,NULL),(4,'Nightmare on Oak Street, Part 23',1997,'The murderous Terry stalks Oak Street','Y',2,3,10.0),(5,'The Wide Brimmed Hat',2005,'Fascinating life story of a wide brimmed hat','N',1,5,NULL),(6,'Sense and Insensitivity',2001,'She longs for a new life with Mr Arcy, he longs for a small cottage in the Hamptons','Y',3,6,16.0),(7,'Planet of the Japes',1967,'Earth has been destroyed, to be taken over by a species of comedians','Y',5,4,13.0),(8,'The Maltese Poodle',1947,'A mysterious bite mark, a guilty looking poodle. 1st class thriller','Y',1,1,3.0),(9,'15th Late Afternoon',1989,'One of Shakespeare\'s lesser known plays','N',5,6,13.0),(10,'Soylent Yellow',1967,'Detective Billy Brambles discovers Soylent Yellow is made of Soya Bean.  Ewwww!','Y',5,5,13.0);
/*!40000 ALTER TABLE `films` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `LocationId` int(11) NOT NULL,
  `Street` varchar(100) DEFAULT NULL,
  `City` varchar(75) DEFAULT NULL,
  `State` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`LocationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'Main Steet','Big Apple City','New State'),(2,'Winding Road','Windy Village','Golden State'),(3,'Tiny Terrace','Big City','Small State');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memberdetails`
--

DROP TABLE IF EXISTS `memberdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memberdetails` (
  `MemberId` int(11) NOT NULL,
  `FirstName` varchar(50) CHARACTER SET utf8 NOT NULL,
  `LastName` varchar(50) CHARACTER SET utf8 NOT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Street` varchar(100) DEFAULT NULL,
  `City` varchar(75) DEFAULT NULL,
  `State` varchar(75) DEFAULT NULL,
  `ZipCode` varchar(12) DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `DateOfJoining` date DEFAULT NULL,
  PRIMARY KEY (`MemberId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberdetails`
--

LOCK TABLES `memberdetails` WRITE;
/*!40000 ALTER TABLE `memberdetails` DISABLE KEYS */;
INSERT INTO `memberdetails` VALUES (1,'Katie','Smith','1977-01-09','Main Road','Townsville','Stateside','123456','katie@mail.com','2004-02-23'),(2,'Bob','Robson','1987-01-09','Little Street','Big City','Small State','34565','rob@mail.com','2004-03-13'),(3,'Sandra','Jakes','1957-05-15','The Avenue','Windy Village','Golden State','65423','sandra@her_mail.com','2004-04-13'),(4,'Steve','Gee','1967-10-05','45 Upper Road','New Town','New State','99112','steve@gee.com','2004-02-22'),(5,'John','Jones','1952-10-05','New Lane','Big Apple City','New State','88776','jj@jonesmail.org','2005-01-02'),(6,'Jenny','Jones','1953-08-25','New Lane','Big Apple City','New State','88776','jj@jonesmail.org','2005-01-02');
/*!40000 ALTER TABLE `memberdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab1`
--

DROP TABLE IF EXISTS `tab1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab1` (
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab1`
--

LOCK TABLES `tab1` WRITE;
/*!40000 ALTER TABLE `tab1` DISABLE KEYS */;
INSERT INTO `tab1` VALUES ('Yusuf'),('Sameer'),('Shruti'),('Jenny'),('Yusuf');
/*!40000 ALTER TABLE `tab1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `templocation`
--

DROP TABLE IF EXISTS `templocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `templocation` (
  `LocationId` int(11) NOT NULL,
  `Street` varchar(100) DEFAULT NULL,
  `City` varchar(75) DEFAULT NULL,
  `State` varchar(75) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `templocation`
--

LOCK TABLES `templocation` WRITE;
/*!40000 ALTER TABLE `templocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `templocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vw_unique_names`
--

DROP TABLE IF EXISTS `vw_unique_names`;
/*!50001 DROP VIEW IF EXISTS `vw_unique_names`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vw_unique_names` AS SELECT 
 1 AS `name`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'moviedb'
--

--
-- Dumping routines for database 'moviedb'
--
/*!50003 DROP FUNCTION IF EXISTS `Distance` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Distance`(
    Lat1   decimal(10,6),
    Lon1   decimal(10,6),
    Lat2   decimal(10,6),
    Lon2   decimal(10,6)) RETURNS decimal(10,3)
    DETERMINISTIC
BEGIN
  RETURN 6371 * 2 * ASIN(SQRT(
            POWER(SIN((lat1 - abs(lat2)) * pi()/180 / 2),
            2) + COS(lat1 * pi()/180 ) * COS(abs(lat2) *
            pi()/180) * POWER(SIN((lon1 - lon2) *
            pi()/180 / 2), 2) ));
            
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_film_cat_view` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_film_cat_view`()
Begin
 Create View films_category AS select category,filmname from films,category where films.CategoryId=category.CategoryId;
 End ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_getLastDigitSquare` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_getLastDigitSquare`(INOUT x int)
    COMMENT 'mod1'
begin
    Set x:= x%10;
   Set x:= x*x;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_getMovies` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_getMovies`(IN genre varchar(30))
begin
    select category, filmname from films, category
   where films.categoryid = category.categoryid
   and category.category = genre;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `vw_unique_names`
--

/*!50001 DROP VIEW IF EXISTS `vw_unique_names`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_unique_names` AS select distinct `tab1`.`name` AS `name` from `tab1` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-13 13:26:00
