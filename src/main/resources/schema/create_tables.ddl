CREATE TABLE `bot_group` (
  `bot_name` varchar(20) NOT NULL,
  `group_id` varchar(20) NOT NULL,
  PRIMARY KEY (`bot_name`,`group_id`),
  KEY `bot_name_idx` (`bot_name`),
  KEY `group_id_idx` (`group_id`),
  CONSTRAINT `fk2_bot_name` FOREIGN KEY (`bot_name`) REFERENCES `robot` (`bot_name`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk2_group_id` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `group` (
  `group_id` varchar(20) NOT NULL,
  `group_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `group_service` (
  `group_id` varchar(20) NOT NULL,
  `service_id` varchar(20) NOT NULL,
  PRIMARY KEY (`group_id`,`service_id`),
  KEY `service_id_idx` (`service_id`),
  CONSTRAINT `fk1_group_id` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk1_service_id` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `robot` (
  `bot_name` varchar(20) NOT NULL,
  `bot_status` varchar(25) NOT NULL,
  `bot_type` varchar(20) NOT NULL,
  PRIMARY KEY (`bot_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `service` (
  `service_id` varchar(20) NOT NULL,
  `service_name` varchar(20) NOT NULL,
  `service_type` varchar(20) NOT NULL,
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8