DROP TABLE IF EXISTS capital;
DROP TABLE IF EXISTS build;
DROP TABLE IF EXISTS cost;

CREATE TABLE `capital` (
  `capital_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(300) NOT NULL,
  PRIMARY KEY (`capital_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 CREATE TABLE `build` (
  `build_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`build_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cost` (
  `cost_id` int(11) NOT NULL AUTO_INCREMENT,
  `capital_id` int(11) NOT NULL,
  `build_id` int(11)  NULL,
  `rand` int(11)  NULL,
  `billa` int(11) NULL,
  `billding` int(11) NULL,
  `hotel` int(11) NULL,
  `landmark` int(11) NULL,
  `parasol` int(11) NULL,
  `bangalo` int(11) NULL,
  PRIMARY KEY (`cost_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;