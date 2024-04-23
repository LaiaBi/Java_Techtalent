CREATE DATABASE if not exists Investigadores;
USE Investigadores;
CREATE TABLE facultad (
    codigo int,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo));
CREATE TABLE investigadores (
    DNI VARCHAR (8) NOT NULL,
    nom_apels VARCHAR(255) NOT NULL,
    facultad INT NOT NULL,
    PRIMARY KEY (DNI),
    KEY (facultad),
    FOREIGN KEY (facultad) REFERENCES facultad (codigo) ON DELETE CASCADE ON UPDATE CASCADE);
CREATE TABLE equipos (
    num_serie CHAR (4) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    facultad INT NOT NULL,
    PRIMARY KEY (num_serie),
    KEY (facultad),
    FOREIGN KEY (facultad) REFERENCES facultad (codigo) ON DELETE CASCADE ON UPDATE CASCADE);
CREATE TABLE reserva (
    DNI VARCHAR (8) NOT NULL,
    num_serie CHAR(4) NOT NULL,
    comienzo DATETIME DEFAULT CURRENT_TIMESTAMP, 
    fin DATETIME DEFAULT NULL,
    PRIMARY KEY (DNI, num_serie),
    FOREIGN KEY (DNI) REFERENCES investigadores (DNI) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (num_serie) REFERENCES equipos (num_serie) ON DELETE CASCADE ON UPDATE CASCADE);