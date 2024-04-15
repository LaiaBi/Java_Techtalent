CREATE DATABASE if not exists almacenes;
USE almacenes;
CREATE TABLE almacenes (
    codigo int,
    lugar VARCHAR(100),
    capacidad int,
    PRIMARY KEY (codigo));
CREATE TABLE cajas (
    numreferencia CHAR(5),
    contenido VARCHAR(100),
    valor INT,
    almacen INT,
    PRIMARY KEY (numreferencia),
    FOREIGN KEY (almacen) REFERENCES almacenes(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE );