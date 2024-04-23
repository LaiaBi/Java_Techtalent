CREATE DATABASE if not exists empleados;
USE empleados;
CREATE TABLE departamentos (
    codigo int,
    nombre VARCHAR(100),
    presupuesto int,
    PRIMARY KEY (codigo));
CREATE TABLE empleados (
    dni VARCHAR(8),
    nombre VARCHAR(100),
    apellidos VARCHAR(255),
    departamento INT,
    PRIMARY KEY (dni),
    FOREIGN KEY (departamento) REFERENCES departamentos(codigo) ON DELETE CASCADE
      ON UPDATE CASCADE );