CREATE DATABASE if not exists PiezasProveedor;
USE PiezasProveedor;
CREATE TABLE piezas (
    codigo int,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo));
CREATE TABLE proveedores (
    id char(4),
    nombre VARCHAR(100),
    PRIMARY KEY (id));
CREATE TABLE suministra (
    codigoPieza int,
    idProveedor CHAR(4),
    precio int,
    PRIMARY KEY (codigoPieza,idProveedor),
    FOREIGN KEY (codigoPieza) REFERENCES piezas(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (idProveedor) REFERENCES proveedores(id) ON DELETE CASCADE
      ON UPDATE CASCADE );