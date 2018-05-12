/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - db_user_rating_prediction
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `db_user_rating_prediction`;

USE `db_user_rating_prediction`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_code` int(5) NOT NULL auto_increment,
  `adminid` char(30) NOT NULL,
  `password` char(15) NOT NULL,
  `admin_name` char(50) NOT NULL,
  PRIMARY KEY  (`admin_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_code`,`adminid`,`password`,`admin_name`) values (1,'admin','admin','admin');

/*Table structure for table `m_cart` */

DROP TABLE IF EXISTS `m_cart`;

CREATE TABLE `m_cart` (
  `crt_id` int(50) NOT NULL auto_increment,
  `user_id` varchar(20) default NULL,
  `mov_name` varchar(50) default NULL,
  `mov_code` int(10) default NULL,
  `cat_code` int(50) default NULL,
  `del_status` varchar(250) default 'pending',
  PRIMARY KEY  (`crt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_cart` */

insert into `m_cart` (`crt_id`,`user_id`,`mov_name`,`mov_code`,`cat_code`,`del_status`) values (1,'2','Veer Abhimanyu',2,4,'delivered');
insert into `m_cart` (`crt_id`,`user_id`,`mov_name`,`mov_code`,`cat_code`,`del_status`) values (2,'2','Veer Abhimanyu',2,4,'delivered');
insert into `m_cart` (`crt_id`,`user_id`,`mov_name`,`mov_code`,`cat_code`,`del_status`) values (3,'1','Veer Abhimanyu',2,4,'delivered');

/*Table structure for table `m_category` */

DROP TABLE IF EXISTS `m_category`;

CREATE TABLE `m_category` (
  `cat_code` int(4) NOT NULL auto_increment,
  `cat_name` varchar(50) NOT NULL,
  `cat_shortname` char(20) NOT NULL,
  PRIMARY KEY  (`cat_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_category` */

insert into `m_category` (`cat_code`,`cat_name`,`cat_shortname`) values (4,'Kid Movies','kid');
insert into `m_category` (`cat_code`,`cat_name`,`cat_shortname`) values (5,'Romantic','Movies');
insert into `m_category` (`cat_code`,`cat_name`,`cat_shortname`) values (6,'Horror Movies','horror');
insert into `m_category` (`cat_code`,`cat_name`,`cat_shortname`) values (7,'Action','action');
insert into `m_category` (`cat_code`,`cat_name`,`cat_shortname`) values (8,'Adventure','ADV');

/*Table structure for table `m_data` */

DROP TABLE IF EXISTS `m_data`;

CREATE TABLE `m_data` (
  `id` int(200) NOT NULL auto_increment,
  `item_id` int(200) default NULL,
  `u_id` int(200) default NULL,
  `rating` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_data` */

/*Table structure for table `m_item` */

DROP TABLE IF EXISTS `m_item`;

CREATE TABLE `m_item` (
  `movie_id` int(6) NOT NULL auto_increment,
  `movie_name` varchar(50) NOT NULL,
  `cat_code` int(4) NOT NULL,
  `year` varchar(100) default NULL,
  `movie_image_name` varchar(50) NOT NULL default 'null',
  `rating` varchar(50) default '0',
  `revw_no` int(250) default '0',
  `unitem_status` varchar(100) default 'false',
  PRIMARY KEY  (`movie_id`),
  KEY `cat_code` (`cat_code`),
  KEY `item_code` (`movie_id`),
  CONSTRAINT `m_item_ibfk_1` FOREIGN KEY (`cat_code`) REFERENCES `m_category` (`cat_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_item` */

insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (1,'Ramayana',4,'21-01-2017','1.jpg','3.6666666666667',3,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (2,'Veer Abhimanyu',4,'21-01-2018','2.jpg','4',5,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (3,'Bum bum Bole',4,'22-03-2018','3.jpg','4',3,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (5,'My friend Ganesha',4,'1-01-2017','5.jpg','0',0,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (9,'Gunja',4,'21-01-2017','6.jpg','4.25',1,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (10,'Epic',4,'21-01-2017','4.jpg','0',0,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (11,'Day Lights End',7,'21-01-2016','2.jpg','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (12,'Defender',7,'21-01-2018','4.jpg','0',0,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (13,'Non_Stop',7,'28-01-2017','5.jpg','0',0,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (14,'The Last Airbender',8,'21-01-2017','1.jpg','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (15,'DDLJ',5,'2000','7.jpg','0',0,'true');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (16,'DDLj',5,'2016','null','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (17,'ABC',4,'2017','null','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (19,'MNO',4,'2018','null','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (21,'AAA',5,'2016','null','0',0,'false');
insert into `m_item` (`movie_id`,`movie_name`,`cat_code`,`year`,`movie_image_name`,`rating`,`revw_no`,`unitem_status`) values (22,'AAA',6,'2016','null','0',0,'false');

/*Table structure for table `m_order` */

DROP TABLE IF EXISTS `m_order`;

CREATE TABLE `m_order` (
  `order_id` int(20) NOT NULL auto_increment,
  `item_id` int(20) default NULL,
  `user_rate` double default '0',
  `review` varchar(200) default NULL,
  `user_id` varchar(200) default NULL,
  `cat_code` int(50) default NULL,
  PRIMARY KEY  (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_order` */

insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (1,2,4,NULL,'1',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (2,9,3.5,NULL,'2',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (5,12,4,NULL,'1',7);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (10,9,5,NULL,'1',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (11,3,4,NULL,'1',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (14,3,4,NULL,'2',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (15,2,4,NULL,'2',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (16,2,4,NULL,'2',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (17,2,3,NULL,'2',4);
insert into `m_order` (`order_id`,`item_id`,`user_rate`,`review`,`user_id`,`cat_code`) values (18,2,5,NULL,'1',4);

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_no` int(10) NOT NULL auto_increment,
  `title` varchar(10) default NULL,
  `u_name` varchar(50) default NULL,
  `u_mail` varchar(50) default NULL,
  `u_pass` varchar(50) default NULL,
  `dob` varchar(50) default NULL,
  PRIMARY KEY  (`u_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_no`,`title`,`u_name`,`u_mail`,`u_pass`,`dob`) values (1,NULL,'bharath','kumarbharath347@gmail.com','bharath','male');
insert into `m_user` (`u_no`,`title`,`u_name`,`u_mail`,`u_pass`,`dob`) values (2,'Mrs','Bagath','bagath@gmail.com','Bagath','2018-01-21');
insert into `m_user` (`u_no`,`title`,`u_name`,`u_mail`,`u_pass`,`dob`) values (3,'Mr.','sharath','sharath@gmail.com','sharath','2018-05-09');

/*Table structure for table `un_item_list` */

DROP TABLE IF EXISTS `un_item_list`;

CREATE TABLE `un_item_list` (
  `un_id` int(11) NOT NULL auto_increment,
  `item_name` varchar(200) default NULL,
  `item_code` int(20) default NULL,
  `cat_name` varchar(200) default NULL,
  `cat_code` varchar(200) default NULL,
  `item_prize` varchar(200) default NULL,
  PRIMARY KEY  (`un_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `un_item_list` */

insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (1,'Ramayana',1,'Kid Movies','4','5');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (2,'Veer Abhimanyu',2,'Kid Movies','4','4');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (3,'Bum bum Bole',3,'Kid Movies','4','4');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (4,'Gunja',9,'Kid Movies','4','4.25');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (5,'Non_Stop',13,'Action','7','0');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (6,'Defender',12,'Action','7','0');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (7,'Epic',10,'Kid Movies','4','0');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (8,'My friend Ganesha',5,'Kid Movies','4','0');
insert into `un_item_list` (`un_id`,`item_name`,`item_code`,`cat_name`,`cat_code`,`item_prize`) values (10,'DDLJ',15,'Romantic','5','0');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
