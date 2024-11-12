CREATE DATABASE app_restaurant

CREATE TABLE menu_category(
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `available` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
)

CREATE TABLE