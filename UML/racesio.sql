-- Adminer 4.7.7 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `Circuit`;
CREATE TABLE `Circuit` (
  `idCircuit` int(100) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `taille` int(100) NOT NULL,
  `pays` varchar(100) NOT NULL,
  PRIMARY KEY (`idCircuit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Circuit` (`idCircuit`, `nom`, `taille`, `pays`) VALUES
(1,	'nom',	100,	'France'),
(2,	'Kamikaz',	400,	'Belgique'),
(3,	'PlayBoy',	350,	'Netherland'),
(4,	'katasi',	50,	'france'),
(5,	'tatasi',	50,	'france');

DROP TABLE IF EXISTS `Course`;
CREATE TABLE `Course` (
  `idCourse` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `nbrSpectateur` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Course` (`idCourse`, `nom`, `type`, `nbrSpectateur`) VALUES
(1,	'RaceMOTO',	'CourseMoto',	250),
(3,	'RaceCar',	'CourseVoiture',	95),
(4,	'MotorsX',	'Motoriste',	500),
(5,	'CarDix',	'voiture',	420);

DROP TABLE IF EXISTS `Ecurie`;
CREATE TABLE `Ecurie` (
  `idEcurie` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `sponsor` varchar(50) DEFAULT NULL,
  `motoriste` varchar(50) DEFAULT NULL,
  `idCourse` int(11) NOT NULL,
  PRIMARY KEY (`idEcurie`),
  KEY `idCourse` (`idCourse`),
  CONSTRAINT `Ecurie_ibfk_1` FOREIGN KEY (`idCourse`) REFERENCES `Course` (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Ecurie` (`idEcurie`, `nom`, `sponsor`, `motoriste`, `idCourse`) VALUES
(1,	'MotoX',	'Orange',	'Alvin',	1),
(2,	'CarX',	'UberEat',	'Presnel',	3),
(3,	'startup',	'mrRobot',	'izzy',	1);

DROP TABLE IF EXISTS `Mecanicien`;
CREATE TABLE `Mecanicien` (
  `idPersonnel` int(11) NOT NULL AUTO_INCREMENT,
  `qualification` varchar(100) DEFAULT NULL,
  `dateQualification` date DEFAULT NULL,
  PRIMARY KEY (`idPersonnel`),
  CONSTRAINT `Mecanicien_ibfk_1` FOREIGN KEY (`idPersonnel`) REFERENCES `Personnel` (`idPersonnel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Mecanicien` (`idPersonnel`, `qualification`, `dateQualification`) VALUES
(1,	'MecanicienInterieur',	'2005-01-22'),
(2,	'MecanicienExeterieure',	'2003-01-22'),
(3,	'Mécanicien des pièces',	'2019-05-20');

DROP TABLE IF EXISTS `Personnel`;
CREATE TABLE `Personnel` (
  `idPersonnel` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `ville` varchar(100) DEFAULT NULL,
  `cp` varchar(50) DEFAULT NULL,
  `idEcurie` int(11) NOT NULL,
  PRIMARY KEY (`idPersonnel`),
  KEY `idEcurie` (`idEcurie`),
  CONSTRAINT `Personnel_ibfk_1` FOREIGN KEY (`idEcurie`) REFERENCES `Ecurie` (`idEcurie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Personnel` (`idPersonnel`, `nom`, `prenom`, `adresse`, `ville`, `cp`, `idEcurie`) VALUES
(1,	'Esthumba',	'Arnold',	'16 rue dandass-stress',	'ottawa',	'8700',	1),
(2,	'Katasi',	'Justin',	'16 rue jean-jacques rousseau',	'sgdb',	'91700',	2),
(3,	'etshumba',	'daisy',	'dandas-street',	'toronto',	'1050',	1);

DROP TABLE IF EXISTS `Pilote`;
CREATE TABLE `Pilote` (
  `idPersonnel` int(11) NOT NULL AUTO_INCREMENT,
  `numeroPilote` int(11) DEFAULT NULL,
  `nationalite` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPersonnel`),
  CONSTRAINT `Pilote_ibfk_1` FOREIGN KEY (`idPersonnel`) REFERENCES `Personnel` (`idPersonnel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Pilote` (`idPersonnel`, `numeroPilote`, `nationalite`) VALUES
(2,	580,	'Francais');

DROP TABLE IF EXISTS `Spectacteur`;
CREATE TABLE `Spectacteur` (
  `idSpectateur` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `idCourse` int(11) NOT NULL,
  PRIMARY KEY (`idSpectateur`),
  KEY `idCourse` (`idCourse`),
  CONSTRAINT `Spectacteur_ibfk_1` FOREIGN KEY (`idCourse`) REFERENCES `Course` (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Spectacteur` (`idSpectateur`, `nom`, `prenom`, `idCourse`) VALUES
(1,	'esthumba',	'daisy',	1);

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE `utilisateur` (
  `nom` varchar(200) NOT NULL,
  `mdp` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `utilisateur` (`nom`, `mdp`) VALUES
('katasi',	'kA1@aa');

DROP TABLE IF EXISTS `Voiture`;
CREATE TABLE `Voiture` (
  `idVoiture` int(11) NOT NULL AUTO_INCREMENT,
  `marque` varchar(100) DEFAULT NULL,
  `modele` varchar(100) DEFAULT NULL,
  `nbCheveaux` int(11) DEFAULT NULL,
  `idMecanicien` int(11) NOT NULL,
  `idPilote` int(11) NOT NULL,
  PRIMARY KEY (`idVoiture`),
  KEY `idMecanicien` (`idMecanicien`),
  CONSTRAINT `Voiture_ibfk_1` FOREIGN KEY (`idMecanicien`) REFERENCES `Mecanicien` (`idPersonnel`),
  CONSTRAINT `Voiture_ibfk_2` FOREIGN KEY (`idMecanicien`) REFERENCES `Pilote` (`idPersonnel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `Voiture` (`idVoiture`, `marque`, `modele`, `nbCheveaux`, `idMecanicien`, `idPilote`) VALUES
(3,	'peugeot',	'208',	50,	2,	2);

-- 2021-11-10 17:04:10
