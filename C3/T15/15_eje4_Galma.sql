--ejercicio 10 unid. 14
-- 10 TUPLAS
USE galmacenes
INSERT INTO cajeros (codigo, nomApels) VALUES 
    (3333, 'Garcia'),
    (2345, 'Esteve'),
    (12345645, 'Dani'),
    (657, 'Juan'),
    (12376745, 'Pedro'),
    (878787, 'Pepe'),
    (444, 'Mar'),
    (777, 'Marcos'),
    (345,'Tamara'),
    (999, 'Marquitos');
    
INSERT INTO productos (codigo, nombre,precio) VALUES 
    (3333, 'patatas',5),
    (2345, 'fresas',3),
    (12345645, 'tomates',2),
    (657, 'jabón',2),
    (12376745, 'papel',1),
    (878787, 'pizza',4),
    (444, 'queso',2),
    (777, 'agua',1),
    (676, 'aguacate',5),
    (999, 'café',1);

INSERT INTO maquinas_registradoras (codigo, piso) VALUES 
    (3333, 2),
    (2345, 1),
    (12345645, 5),
    (657, 4),
    (12376745, 2),
    (878787, 3),
    (444, 6),
    (777, 5),
    (675,4),
    (999, 1);

INSERT INTO venta (cajero, maquina,producto) VALUES 
    (3333, 657,999),
    (2345, 3333,12345645),
    (12345645,777,3333),
    (657,444,2345),
    (12376745, 2345,878787),
    (878787, 999,657),
    (444, 12345645,444),
    (777, 878787,12376745),
    (345,675,676),
    (999,3333,777);
