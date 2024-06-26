CREATE DATABASE if not exists Directores;
USE Directores;
CREATE TABLE despachos (
    Numero int,
    capacidad int,
    PRIMARY KEY (Numero));
CREATE TABLE Directores (
    dni VARCHAR(8),
    nombre VARCHAR(255),
    dniJefe VARCHAR(8),
    despacho int,
    PRIMARY KEY (dni),
    FOREIGN KEY (despacho) REFERENCES despachos(Numero) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (dniJefe) REFERENCES Directores(dni) ON DELETE CASCADE
      ON UPDATE CASCADE );