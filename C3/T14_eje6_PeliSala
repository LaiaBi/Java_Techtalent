CREATE DATABASE if not exists PeliSala;
USE PeliSala;
CREATE TABLE peliculas (
    codigo int,
    nombre VARCHAR(100),
    clasifEdad int,
    PRIMARY KEY (codigo));
CREATE TABLE salas (
    codigo int,
    nombre VARCHAR(100),
    pelicula INT,
    PRIMARY KEY (codigo),
    FOREIGN KEY (pelicula) REFERENCES peliculas(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE );