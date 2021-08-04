-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2019 a las 06:06:01
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.0.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `library_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `applicant`
--

CREATE TABLE `applicant` (
  `cod_app` int(11) NOT NULL,
  `nro_app` varchar(10) NOT NULL,
  `name_app` varchar(15) NOT NULL,
  `surn_app` varchar(15) NOT NULL,
  `datebir_app` date NOT NULL,
  `phon_app` bigint(11) NOT NULL,
  `sex_app` varchar(10) NOT NULL,
  `type_app` varchar(15) NOT NULL,
  `datecrea_app` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `applicant`
--

INSERT INTO `applicant` (`cod_app`, `nro_app`, `name_app`, `surn_app`, `datebir_app`, `phon_app`, `sex_app`, `type_app`, `datecrea_app`) VALUES
(1, '1', 'Yubelka', 'Muñoz', '2019-11-07', 4247731293, 'Femenino', 'Estudiante', '2019-11-03'),
(2, '2', 'Yurimar', 'Muñoz', '2003-02-11', 4247773422, 'FEMENINO', 'Estudiante', '2019-11-03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `cod_book` int(11) NOT NULL,
  `nro_book` varchar(11) NOT NULL,
  `name_book` varchar(50) NOT NULL,
  `edit_book` varchar(30) NOT NULL,
  `year_book` int(11) NOT NULL,
  `locat_book` varchar(100) NOT NULL,
  `type_book` varchar(50) NOT NULL,
  `area_book` varchar(30) NOT NULL,
  `avai_book` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`cod_book`, `nro_book`, `name_book`, `edit_book`, `year_book`, `locat_book`, `type_book`, `area_book`, `avai_book`) VALUES
(1, 'C001', 'Matematicas con Pipo', 'Girasol', 2003, 'Pasillo 2', 'Ciencias', 'Matematica', 1),
(2, 'C002', 'El Caballero de la Armadura Oxidada', 'Saleciana', 2005, 'Pasillo 2', 'Entretenimiento', 'Castellano', 1),
(3, 'C003', 'Pretty Liars  Laddies', 'USA', 2000, 'estante 4', 'Entretenimiento', 'Ingles', 1),
(4, 'C004', 'Programacion en Java', 'USA', 2017, 'repisa principal', 'Informatica', 'Programacion', 1),
(5, 'C005', 'El caballo de Troya', 'Salesiana', 2000, 'sala', 'Entretenimiento', 'castellano', 1),
(7, 'C006', 'Fisica', 'Kores', 2001, 'Pasillo 7', 'Ciencias', 'Fisica', 0),
(8, 'C007', 'Biologia', 'Kores', 2003, 'Sala de lectura', 'Ciencias', 'Biologia', 1),
(9, 'C008', 'Ingles 4to', 'Salesiana', 2007, 'Sala de lectura', 'Idiomas', 'Ingles', 1),
(11, 'C009', 'Librito', 'kids', 1998, 'Sala de niños', 'Niños', 'Lectura', 1),
(12, 'C010', 'Matematicas con Pipo', 'Girasol', 2003, 'Pasillo 2', 'Ciencias', 'Matematica', 0),
(14, 'C012', 'Matematicas 2do', 'Girasol', 2003, 'Pasillo 2', 'Ciencias', 'Matematica', 0),
(15, 'C013', 'Fisica1', 'Sol1', 2002, 'Estante 1', 'Ciencas1', 'Fisisca1', 0),
(16, 'C016', 'Las leyendas del Tachira', 'Tachira', 1995, 'Pasillo 8', 'Lectura y Entretenimento', 'Castellano', 1),
(17, 'C017', 'el agotado', 'agotado', 1234, 'pasillo agotado', 'AGOTADO', 'agotado', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `delivery`
--

CREATE TABLE `delivery` (
  `cod_deli` int(11) NOT NULL,
  `cod_book` int(11) NOT NULL,
  `cod_app` int(11) NOT NULL,
  `des_deli` varchar(50) NOT NULL,
  `date_deli` date NOT NULL,
  `dayexc_deli` int(11) NOT NULL,
  `cod_loan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loanbook`
--

CREATE TABLE `loanbook` (
  `cod_loan` int(11) NOT NULL,
  `cod_book` int(11) NOT NULL,
  `cod_app` int(11) NOT NULL,
  `des_loan` varchar(30) NOT NULL,
  `avai_loan` varchar(15) NOT NULL,
  `date_loan` date NOT NULL,
  `datereturn_loan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solovarchar`
--

CREATE TABLE `solovarchar` (
  `cod_book` varchar(30) NOT NULL,
  `name_book` varchar(30) NOT NULL,
  `edit_book` varchar(30) NOT NULL,
  `year_book` varchar(30) NOT NULL,
  `locat_book` varchar(30) NOT NULL,
  `type_book` varchar(30) NOT NULL,
  `area_book` varchar(30) NOT NULL,
  `avai_book` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `cod_user` int(11) NOT NULL,
  `name_user` varchar(15) NOT NULL,
  `surn_user` varchar(15) NOT NULL,
  `datecrea_user` date NOT NULL,
  `type_user` varchar(15) NOT NULL,
  `user_user` varchar(30) NOT NULL,
  `pass_user` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`cod_user`, `name_user`, `surn_user`, `datecrea_user`, `type_user`, `user_user`, `pass_user`) VALUES
(1, 'Yubelka', 'Muñoz', '2019-10-25', 'ADMINISTRADOR', 'admin', 'admin'),
(2, 'Yurimar', 'Muñoz', '2019-11-04', 'ADMINSTRADOR', 'yurimar2003', '123456');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `applicant`
--
ALTER TABLE `applicant`
  ADD PRIMARY KEY (`cod_app`);

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`cod_book`);

--
-- Indices de la tabla `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`cod_deli`),
  ADD KEY `cod_book` (`cod_book`),
  ADD KEY `cod_app` (`cod_app`);

--
-- Indices de la tabla `loanbook`
--
ALTER TABLE `loanbook`
  ADD PRIMARY KEY (`cod_loan`),
  ADD KEY `cod_book` (`cod_book`),
  ADD KEY `cod_app` (`cod_app`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`cod_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `applicant`
--
ALTER TABLE `applicant`
  MODIFY `cod_app` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `cod_book` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `delivery`
--
ALTER TABLE `delivery`
  MODIFY `cod_deli` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `loanbook`
--
ALTER TABLE `loanbook`
  MODIFY `cod_loan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `cod_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `delivery`
--
ALTER TABLE `delivery`
  ADD CONSTRAINT `delivery_ibfk_1` FOREIGN KEY (`cod_book`) REFERENCES `book` (`cod_book`),
  ADD CONSTRAINT `delivery_ibfk_2` FOREIGN KEY (`cod_app`) REFERENCES `applicant` (`cod_app`);

--
-- Filtros para la tabla `loanbook`
--
ALTER TABLE `loanbook`
  ADD CONSTRAINT `loanbook_ibfk_1` FOREIGN KEY (`cod_book`) REFERENCES `book` (`cod_book`),
  ADD CONSTRAINT `loanbook_ibfk_2` FOREIGN KEY (`cod_app`) REFERENCES `applicant` (`cod_app`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
