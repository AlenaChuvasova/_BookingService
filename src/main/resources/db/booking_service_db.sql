CREATE SCHEMA `booking_service_db` DEFAULT CHARACTER SET utf8;

CREATE TABLE `booking_service_db`.`book`
(
  `id`          bigint(20)    NOT NULL AUTO_INCREMENT,
  `imageUrl`    varchar(100)  NOT NULL,
  `name`        varchar(45)   NOT NULL,
  `authors`     varchar(250)  NOT NULL,
  `description` varchar(1500) NOT NULL,
  `tags`        varchar(50)   NOT NULL,
  `status`      varchar(45)   NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`bookqueue`
(
  `id`        bigint(20)  NOT NULL AUTO_INCREMENT,
  `bookId`    bigint(20)  NOT NULL,
  `userId`    bigint(20)  NOT NULL,
  `order`     bigint(20)  NOT NULL,
  `createdAt` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`buyrequest`
(
  `id`                bigint(20)    NOT NULL,
  `initiatorId`       bigint(20)    NOT NULL,
  `description`       varchar(1500) NOT NULL,
  `status`            varchar(45)   NOT NULL,
  `resolutionComment` varchar(1000) NOT NULL,
  `bookId`            bigint(20)    NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`buyrequestvotes`
(
  `id`           bigint(20) NOT NULL,
  `buyRequestId` bigint(20) NOT NULL,
  `userId`       bigint(20) NOT NULL,
  `want`         tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`comment`
(
  `id`          bigint(20)    NOT NULL AUTO_INCREMENT,
  `authorId`    bigint(20)    NOT NULL,
  `type`        varchar(45)   NOT NULL,
  `description` varchar(1500) NOT NULL,
  `createdAt`   date          NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`paperbook`
(
  `id`     bigint(20)  NOT NULL AUTO_INCREMENT,
  `bookId` bigint(20)  NOT NULL,
  `isbn`   varchar(50) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`user`
(
  `id`       bigint(20)   NOT NULL AUTO_INCREMENT,
  `role`     varchar(45)  NOT NULL,
  `name`     varchar(45)  NOT NULL,
  `photoUrl` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `booking_service_db`.`useraccount`
(
  `id`       BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `userId`   BIGINT(20)  NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `booking_service_db`.`wishlistitem`
(
  `id`        BIGINT(20) NOT NULL AUTO_INCREMENT,
  `userId`    BIGINT(20) NOT NULL,
  `bookId`    BIGINT(20) NOT NULL,
  `createdAt` DATE       NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;
