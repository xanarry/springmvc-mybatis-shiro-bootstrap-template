DROP DATABASE IF EXISTS test;
CREATE DATABASE test charset = "utf8";
USE test;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(10) UNIQUE NOT NULL,
  `age`  TINYINT NOT NULL,
  `sex` VARCHAR(2),
  `email` VARCHAR(50),
  `password` VARCHAR(50),
  `hobby` VARCHAR(20),
  `address` VARCHAR(50)
) DEFAULT charset = "utf8" ENGINE=InnoDB;