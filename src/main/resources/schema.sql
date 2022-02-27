# database
CREATE SCHEMA `time_master` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;

# t_category
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL COMMENT 'userId = -1: 默认的category\n',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

# t_event
CREATE TABLE `event` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `ringtone_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `notification_msg` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `location` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_unicode_ci,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`),
  KEY `user_idx` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

# t_event_category
CREATE TABLE `reln_event_category` (
  `event_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  PRIMARY KEY (`event_id`,`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

# t_user
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `first_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gender` varchar(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'M/F',
  `phone` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `encrypt_pwd` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hashed_pwd` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'SHA256(password)',
  `date_of_birth` date DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL COMMENT '标记用户启用/禁用 (1:启用, -1:禁用)',
  `locale` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `country` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `timezone` tinyint(4) DEFAULT NULL,
  `avatar_path` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像的储存路径',
  `last_login_addr` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '储存最后一次登录的IP地址',
  `last_login_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `email_idx` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
