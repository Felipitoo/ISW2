-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: restapi
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external`
--

DROP TABLE IF EXISTS `external`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `external` (
  `id_external` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rut` varchar(255) DEFAULT NULL,
  `loan_loan_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_external`),
  KEY `FK2314003cpt87p8g3h6vjrknw0` (`loan_loan_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external`
--

LOCK TABLES `external` WRITE;
/*!40000 ALTER TABLE `external` DISABLE KEYS */;
/*!40000 ALTER TABLE `external` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (4),(4),(4),(4),(4),(4),(4),(4),(4),(4);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota`
--

DROP TABLE IF EXISTS `nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nota` (
  `id2` bigint(20) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id2`),
  KEY `FKnntty3x04q5r49da0fum6ft58` (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota`
--

LOCK TABLES `nota` WRITE;
/*!40000 ALTER TABLE `nota` DISABLE KEYS */;
/*!40000 ALTER TABLE `nota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_external`
--

DROP TABLE IF EXISTS `tbl_external`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_external` (
  `id_external` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rut` varchar(255) DEFAULT NULL,
  `loan_loan_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_external`),
  KEY `FKaqpnr0ifr3n1xplmbkvuhy5pf` (`loan_loan_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_external`
--

LOCK TABLES `tbl_external` WRITE;
/*!40000 ALTER TABLE `tbl_external` DISABLE KEYS */;
INSERT INTO `tbl_external` VALUES (0,'extern1','1111111-1',0),(1,'extern2','222222222-2',1);
/*!40000 ALTER TABLE `tbl_external` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_group`
--

DROP TABLE IF EXISTS `tbl_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_group` (
  `id_group` int(11) NOT NULL,
  `name_group` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_group`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_group`
--

LOCK TABLES `tbl_group` WRITE;
/*!40000 ALTER TABLE `tbl_group` DISABLE KEYS */;
INSERT INTO `tbl_group` VALUES (0,'Encargados'),(1,'Grupo 1'),(2,'Grupo 2');
/*!40000 ALTER TABLE `tbl_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_loan`
--

DROP TABLE IF EXISTS `tbl_loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_loan` (
  `loan_number` int(11) NOT NULL,
  `loan_date` datetime DEFAULT NULL,
  PRIMARY KEY (`loan_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_loan`
--

LOCK TABLES `tbl_loan` WRITE;
/*!40000 ALTER TABLE `tbl_loan` DISABLE KEYS */;
INSERT INTO `tbl_loan` VALUES (0,'2019-04-02 00:00:00'),(1,'2019-05-04 00:00:00');
/*!40000 ALTER TABLE `tbl_loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_loan_external`
--

DROP TABLE IF EXISTS `tbl_loan_external`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_loan_external` (
  `loan_loan_number` int(11) NOT NULL,
  `external_id_external` int(11) NOT NULL,
  PRIMARY KEY (`loan_loan_number`,`external_id_external`),
  UNIQUE KEY `UK_d1xkiwqldi8s1bteudepa3wsr` (`external_id_external`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_loan_external`
--

LOCK TABLES `tbl_loan_external` WRITE;
/*!40000 ALTER TABLE `tbl_loan_external` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_loan_external` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_loan_tool`
--

DROP TABLE IF EXISTS `tbl_loan_tool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_loan_tool` (
  `loan_loan_number` int(11) NOT NULL,
  `tool_id_tool` int(11) NOT NULL,
  PRIMARY KEY (`loan_loan_number`,`tool_id_tool`),
  UNIQUE KEY `UK_5qgj1rkxvsygw3s2wuuuevma9` (`tool_id_tool`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_loan_tool`
--

LOCK TABLES `tbl_loan_tool` WRITE;
/*!40000 ALTER TABLE `tbl_loan_tool` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_loan_tool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_machine`
--

DROP TABLE IF EXISTS `tbl_machine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_machine` (
  `id_machine` int(11) NOT NULL,
  `availability` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `usage_time` int(11) DEFAULT NULL,
  `group_id_group` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_machine`),
  KEY `FK5pjh6w2bvjuliy8egochw1vv7` (`group_id_group`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_machine`
--

LOCK TABLES `tbl_machine` WRITE;
/*!40000 ALTER TABLE `tbl_machine` DISABLE KEYS */;
INSERT INTO `tbl_machine` VALUES (0,1,'maquina1',2,1),(1,1,'maquina2',2,2),(2,0,'maquina3',2,2),(3,0,'maquina4',2,1),(4,1,'maquina6',2,2),(5,1,'maquina6',2,1);
/*!40000 ALTER TABLE `tbl_machine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_storage`
--

DROP TABLE IF EXISTS `tbl_storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_storage` (
  `id_storage` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `group_id_group` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_storage`),
  KEY `FK5cfiu9yv1l0mnrmsojmvh7jdq` (`group_id_group`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_storage`
--

LOCK TABLES `tbl_storage` WRITE;
/*!40000 ALTER TABLE `tbl_storage` DISABLE KEYS */;
INSERT INTO `tbl_storage` VALUES (0,'2019-05-06',1),(1,'2019-06-20',2);
/*!40000 ALTER TABLE `tbl_storage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tool`
--

DROP TABLE IF EXISTS `tbl_tool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_tool` (
  `id_tool` int(11) NOT NULL,
  `availability` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `loan_loan_number` int(11) DEFAULT NULL,
  `storage_id_storage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_tool`),
  KEY `FKrs2vw1blpyyy8miit2q219v5a` (`loan_loan_number`),
  KEY `FKhstqx49o5mqiubg18uxyxr1t8` (`storage_id_storage`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tool`
--

LOCK TABLES `tbl_tool` WRITE;
/*!40000 ALTER TABLE `tbl_tool` DISABLE KEYS */;
INSERT INTO `tbl_tool` VALUES (0,0,'herramienta1',0,0),(1,1,'herramienta3',1,0),(2,1,'herramienta2',1,0);
/*!40000 ALTER TABLE `tbl_tool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_type_user`
--

DROP TABLE IF EXISTS `tbl_type_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_type_user` (
  `id_type_user` int(11) NOT NULL,
  `type_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_type_user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_type_user`
--

LOCK TABLES `tbl_type_user` WRITE;
/*!40000 ALTER TABLE `tbl_type_user` DISABLE KEYS */;
INSERT INTO `tbl_type_user` VALUES (0,'Encargado'),(1,'Miembro');
/*!40000 ALTER TABLE `tbl_type_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_user` (
  `id_user` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES (0,'email@email','admin','123','admin'),(1,'email@email.com','usuario1','123','123'),(2,'email@email.com','usuario2','123','123'),(3,'admin@admin.cl','admin','$2a$10$CnCQy.h9BbohaJRxZgYyHukb1wxwFteQWDbCqMD.aU5E4ZkwCNcR6','Dio');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user_typeusers`
--

DROP TABLE IF EXISTS `tbl_user_typeusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_user_typeusers` (
  `users_id_user` int(11) NOT NULL,
  `typeusers_id_type_user` int(11) NOT NULL,
  PRIMARY KEY (`users_id_user`,`typeusers_id_type_user`),
  KEY `FKl4nluf8xwr9i2tiut3i7on74v` (`typeusers_id_type_user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user_typeusers`
--

LOCK TABLES `tbl_user_typeusers` WRITE;
/*!40000 ALTER TABLE `tbl_user_typeusers` DISABLE KEYS */;
INSERT INTO `tbl_user_typeusers` VALUES (0,0),(1,1),(2,1),(3,0);
/*!40000 ALTER TABLE `tbl_user_typeusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tool`
--

DROP TABLE IF EXISTS `tool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tool` (
  `id_tool` int(11) NOT NULL,
  `availability` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `loan_loan_number` int(11) DEFAULT NULL,
  `storage_id_storage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_tool`),
  KEY `FKsef9ma1r2fkdxvmst0lhqt1rf` (`loan_loan_number`),
  KEY `FKh4c451x8to84wxmd8l9kr510i` (`storage_id_storage`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tool`
--

LOCK TABLES `tool` WRITE;
/*!40000 ALTER TABLE `tool` DISABLE KEYS */;
/*!40000 ALTER TABLE `tool` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-21 22:14:48
