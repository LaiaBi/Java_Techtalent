CREATE DATABASE if not exists Tienda_Informatica;
USE Tienda_Informatica;
CREATE TABLE fabricantes (
    codigo int,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo));
CREATE TABLE articulos (
    codigo int,
    nombre VARCHAR(100),
    precio int,
	 fabricante INT,
	 PRIMARY KEY (codigo),
    FOREIGN KEY (fabricante) REFERENCES fabricantes(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE );
    