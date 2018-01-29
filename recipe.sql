-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: recipebook
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `recipes`
--

DROP TABLE IF EXISTS `recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recipes` (
  `description` varchar(300) NOT NULL,
  `imagepath` varchar(450) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `ingredients` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`description`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipes`
--

LOCK TABLES `recipes` WRITE;
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
INSERT INTO `recipes` VALUES ('Descriere','https://firebasestorage.googleapis.com/v0/b/angular-course-927b8.appspot.com/o/shutterstock_196184672.jpg?alt=media&token=55b7c801-8662-4717-8e14-aac92807c440','TORT KRANTZ','[ {\n  \"name\" : \"oua\",\n  \"amount\" : 2\n}, {\n  \"name\" : \"zahar (g)\",\n  \"amount\" : 160\n}, {\n  \"name\" : \"nuci (g)\",\n  \"amount\" : 160\n} ]'),('Descriere2','https://firebasestorage.googleapis.com/v0/b/angular-course-927b8.appspot.com/o/13233054_846327095489013_n-1024x764%20(1).jpg?alt=media&token=4d02a5ce-7543-49bf-a62d-58fdabf9ccf0','PUI CU ARDEI GRAS LA TIGAIE','[ {\n  \"name\" : \"pui\",\n  \"amount\" : 1\n}, {\n  \"name\" : \"ardei\",\n  \"amount\" : 2\n}, {\n  \"name\" : \"sare\",\n  \"amount\" : 1\n} ]');
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-29 20:53:08
