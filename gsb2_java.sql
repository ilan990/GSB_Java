-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Dim 24 Avril 2022 à 12:09
-- Version du serveur :  5.7.11
-- Version de PHP :  7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gsb_java`
--

-- --------------------------------------------------------

--
-- Structure de la table `labo`
--

CREATE TABLE `labo` (
  `id_labo` int(11) NOT NULL,
  `nom_labo` varchar(15) CHARACTER SET utf8 NOT NULL,
  `labo_chefVente` varchar(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `labo`
--

INSERT INTO `labo` (`id_labo`, `nom_labo`, `labo_chefVente`) VALUES
(1, 'Sanofi', 'Martin'),
(2, 'pfizer', 'Helmut'),
(3, 'ABBVIE', 'John'),
(4, 'Roche', 'Maria'),
(5, 'BMS', 'Noah');

-- --------------------------------------------------------

--
-- Structure de la table `region`
--

CREATE TABLE `region` (
  `id_region` int(10) NOT NULL,
  `id_sec` int(2) DEFAULT NULL,
  `region_nom` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `region`
--

INSERT INTO `region` (`id_region`, `id_sec`, `region_nom`) VALUES
(1, 1, 'Haut-de-France'),
(2, 4, 'Occitanie'),
(3, 5, 'Auvergne'),
(4, 3, 'île-de-France'),
(5, 2, 'Bretagne'),
(6, 5, 'Normandie');

-- --------------------------------------------------------

--
-- Structure de la table `responsable`
--

CREATE TABLE `responsable` (
  `id_res` int(10) NOT NULL,
  `nom_res` varchar(25) CHARACTER SET utf8 NOT NULL,
  `prenom_res` varchar(25) CHARACTER SET utf8 NOT NULL,
  `telephone` varchar(25) CHARACTER SET utf8 NOT NULL,
  `mail` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `responsable`
--

INSERT INTO `responsable` (`id_res`, `nom_res`, `prenom_res`, `telephone`, `mail`) VALUES
(1, 'Assouline', 'ilan', '0783769291', 'ilan@ilan.com'),
(2, 'touati', 'dan', '0676789876', 'dan@touati.com');

-- --------------------------------------------------------

--
-- Structure de la table `secteur`
--

CREATE TABLE `secteur` (
  `id_sec` int(2) NOT NULL,
  `libelle_sec` varchar(15) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `secteur`
--

INSERT INTO `secteur` (`id_sec`, `libelle_sec`) VALUES
(1, 'Nord'),
(2, 'Ouest'),
(3, 'Paris centre'),
(4, 'Sud'),
(5, 'Est'),
(6, 'NORD-OUEST');

-- --------------------------------------------------------

--
-- Structure de la table `travailler`
--

CREATE TABLE `travailler` (
  `id_vis` int(10) NOT NULL,
  `date` date NOT NULL,
  `id_region` int(10) NOT NULL,
  `role_tra` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `travailler`
--

INSERT INTO `travailler` (`id_vis`, `date`, `id_region`, `role_tra`) VALUES
(1, '2021-12-09', 1, 'caissier'),
(2, '2020-12-16', 3, 'gerant'),
(7, '2022-04-03', 1, 'apiculteur'),
(7, '2022-04-04', 1, 'designer'),
(12, '2022-04-14', 3, 'developpeur back'),
(13, '2022-04-14', 3, 'developpeur back'),
(13, '2022-04-14', 6, 'developpeur WEB');

-- --------------------------------------------------------

--
-- Structure de la table `visiteur`
--

CREATE TABLE `visiteur` (
  `id_vis` int(10) NOT NULL,
  `nom_vis` varchar(25) CHARACTER SET utf8 NOT NULL,
  `prenom_vis` varchar(50) CHARACTER SET utf8 NOT NULL,
  `adresse_vis` varchar(50) CHARACTER SET utf8 NOT NULL,
  `CP_vis` int(10) NOT NULL,
  `ville_vis` varchar(30) CHARACTER SET utf8 NOT NULL,
  `dateEmbauche_vis` date NOT NULL,
  `id_sec` int(2) NOT NULL,
  `id_labo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `visiteur`
--

INSERT INTO `visiteur` (`id_vis`, `nom_vis`, `prenom_vis`, `adresse_vis`, `CP_vis`, `ville_vis`, `dateEmbauche_vis`, `id_sec`, `id_labo`) VALUES
(1, 'Cotuand', 'Lili', '4 avenue de Marlioz', 66000, 'Antibes', '2022-04-08', 1, 1),
(2, 'Brodeur', 'Sophie', '46 place de la gare', 68000, 'Colmar', '2021-04-14', 1, 5),
(3, 'Larocque', 'Martine', '93 rue joseph Vernet', 92140, 'Clamart', '2022-03-09', 3, 2),
(4, 'Devoe', 'Fauna', '98 rue du palais', 93800, 'epinay-sur-seine', '2020-09-22', 3, 4),
(5, 'Austin', 'Josephine', '97 rue Jean Vilar', 33100, 'Begles', '2017-05-03', 2, 4),
(6, 'Simons', 'Mathilda', '28 rue des nations unies', 22000, 'Saint-brieuc', '2019-04-07', 2, 3),
(7, 'Garnier', 'Philippine', '57 chemin des Bateliers', 20090, 'Ajaccio', '2019-02-02', 4, 4),
(8, 'Poulin', 'Edouard', '97 chemin du Lavarin sud', 46000, 'cahors', '2019-04-07', 4, 1),
(9, 'Pichette', 'Charline', '98 rue Marguerite', 94300, 'Vincennes', '2010-04-10', 3, 4),
(10, 'Veronneau', 'Cosette', '54 rue Hubert de lisle', 59120, 'LOOS', '2010-04-15', 1, 3),
(11, 'Assouline', 'Ilan', '5 rue de la mare', 75020, 'Paris', '2022-04-15', 1, 3),
(12, 'Laifer', 'Isaac', '8 bd de la Madeleine', 75009, 'Paris', '2020-09-22', 3, 4),
(13, 'Cotuand', 'Charles', '4 avenue de Marliand', 66000, 'Antibes', '2022-04-21', 6, 1),
(14, 'Assouline', 'Ilan', '71 rue des panoyaux', 75020, 'Paris', '2022-04-03', 1, 3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `labo`
--
ALTER TABLE `labo`
  ADD PRIMARY KEY (`id_labo`);

--
-- Index pour la table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`id_region`),
  ADD KEY `id_sec` (`id_sec`);

--
-- Index pour la table `responsable`
--
ALTER TABLE `responsable`
  ADD PRIMARY KEY (`id_res`);

--
-- Index pour la table `secteur`
--
ALTER TABLE `secteur`
  ADD PRIMARY KEY (`id_sec`);

--
-- Index pour la table `travailler`
--
ALTER TABLE `travailler`
  ADD PRIMARY KEY (`id_vis`,`date`,`id_region`),
  ADD KEY `id_region` (`id_region`);

--
-- Index pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`id_vis`),
  ADD KEY `id_sec` (`id_sec`),
  ADD KEY `id_labo` (`id_labo`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `labo`
--
ALTER TABLE `labo`
  MODIFY `id_labo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `region`
--
ALTER TABLE `region`
  MODIFY `id_region` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `responsable`
--
ALTER TABLE `responsable`
  MODIFY `id_res` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `secteur`
--
ALTER TABLE `secteur`
  MODIFY `id_sec` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `travailler`
--
ALTER TABLE `travailler`
  MODIFY `id_vis` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT pour la table `visiteur`
--
ALTER TABLE `visiteur`
  MODIFY `id_vis` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `region`
--
ALTER TABLE `region`
  ADD CONSTRAINT `region_ibfk_1` FOREIGN KEY (`id_sec`) REFERENCES `secteur` (`id_sec`);

--
-- Contraintes pour la table `travailler`
--
ALTER TABLE `travailler`
  ADD CONSTRAINT `travailler_ibfk_1` FOREIGN KEY (`id_vis`) REFERENCES `visiteur` (`id_vis`);

--
-- Contraintes pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD CONSTRAINT `visiteur_ibfk_1` FOREIGN KEY (`id_sec`) REFERENCES `secteur` (`id_sec`),
  ADD CONSTRAINT `visiteur_ibfk_2` FOREIGN KEY (`id_labo`) REFERENCES `labo` (`id_labo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
