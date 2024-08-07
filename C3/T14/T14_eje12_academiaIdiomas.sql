CREATE DATABASE if not exists academiaIdiomas;
USE academiaIdiomas;
CREATE TABLE cursos (
    codigo INT DEFAULT NULL,
    nombre_curso VARCHAR(150) DEFAULT NULL,
    num_max_alumnos INT DEFAULT NULL,
    num_horas INT NOT NULL,
    fecha_inicio DATETIME DEFAULT NULL,
    fecha_fin DATETIME DEFAULT NULL,
    DNI_profesor VARCHAR (10) DEFAULT NULL,
    PRIMARY KEY (codigo),   
	 KEY (DNI_profesor),
    FOREIGN KEY (DNI_profesor) REFERENCES profesores (DNI) ON DELETE CASCADE ON UPDATE CASCADE);
CREATE TABLE alumnos (
    DNI VARCHAR (10) NOT NULL,
    nombre VARCHAR(80) DEFAULT NULL,
    apellido_1 VARCHAR (50)DEFAULT NULL,
    apellido_2 VARCHAR (50)DEFAULT NULL,
    direccion VARCHAR (150)DEFAULT NULL,
    fecha_nacimiento DATE DEFAULT NULL,
    sexo CHAR (1)DEFAULT NULL,
    curso int (11) NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (curso) REFERENCES cursos (codigo) ON DELETE CASCADE ON UPDATE CASCADE);
CREATE TABLE profesores (
    DNI VARCHAR (10) NOT NULL,
    nombre VARCHAR(80) NOT NULL,
    apellido_1 VARCHAR (60)NOT NULL,
    apellido_2 VARCHAR (60),
    direccion VARCHAR (150),
    titulo VARCHAR (60) NOT NULL,
    gana INT NOT NULL,
    PRIMARY KEY (DNI));