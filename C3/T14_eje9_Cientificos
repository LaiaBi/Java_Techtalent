CREATE DATABASE if not exists cientificos;
USE cientificos;
CREATE TABLE cientificos (
    dni VARCHAR(8),
    nomApels VARCHAR(255),
    PRIMARY KEY (dni));
CREATE TABLE proyecto (
    id char(4),
    nombre VARCHAR(255),
    horas int,
    PRIMARY KEY (id));
CREATE TABLE asignado_A (
    cientifico VARCHAR(8),
    proyecto CHAR(4),
    PRIMARY KEY (cientifico,proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos(dni) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (proyecto) REFERENCES proyecto(id) ON DELETE CASCADE
      ON UPDATE CASCADE );