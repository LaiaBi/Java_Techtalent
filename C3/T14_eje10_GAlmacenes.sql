CREATE DATABASE if not exists GAlmacenes;
USE GAlmacenes;
CREATE TABLE cajeros (
    codigo int,
    nomApels VARCHAR(255),
    PRIMARY KEY (codigo));
CREATE TABLE productos (
    codigo int,
    nombre VARCHAR(100),
    precio int,
    PRIMARY KEY (codigo));
CREATE TABLE maquinas_registradoras (
    codigo int,
    piso int,
    PRIMARY KEY (codigo));
CREATE TABLE venta (
    cajero int,
    maquina int,
    producto int,
    PRIMARY KEY (cajero,maquina,producto),
    FOREIGN KEY (cajero) REFERENCES cajeros(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (maquina) REFERENCES maquinas_registradoras(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (producto) REFERENCES productos(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE );