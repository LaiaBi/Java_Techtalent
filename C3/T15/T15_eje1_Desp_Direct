CREATE DATABASE if not exists Desp_Director;
USE Desp_Director;
CREATE TABLE despachos (
    Numero int,
    capacidad int,
    PRIMARY KEY (Numero));
CREATE TABLE Directores (
    dni VARCHAR(9),
    nombre VARCHAR(255),
    dniJefe VARCHAR(9),
    despacho int,
    PRIMARY KEY (dni),
    FOREIGN KEY (despacho) REFERENCES despachos(Numero) ON DELETE CASCADE
      ON UPDATE CASCADE ,
      FOREIGN KEY (dniJefe) REFERENCES Directores(dni) ON DELETE CASCADE
      ON UPDATE CASCADE );

-- Le añadimos AUTO_INCREMENT
ALTER TABLE despachos CHANGE num num INT(11) NOT NULL AUTO_INCREMENT;

-- 10 TUPLAS
INSERT INTO despachos (capacidad) VALUES 
(2), (8), (10), (6), (4), (12), (5), (11), (23), (4), (11);
INSERT INTO directores (DNI, Nombre, DNIJefe, despacho) VALUES 
    ('3333', 'Garcia', NULL, '2'),
    ('2345', 'Esteve', NULL, '4'),
    ('12345645', 'Dani', NULL, '5'),
    ('657', 'Juan', NULL, '10'),
    ('12376745', 'Pedro', NULL, '9'),
    ('878787', 'Pepe', NULL, '9'),
    ('444', 'Mar', NULL, '7'),
    ('777', 'Marcos', NULL, '6'),
    ('676', 'Teresa', NULL, '6'),
    ('999', 'Marquitos', NULL, '8');