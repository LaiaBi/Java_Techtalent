--ejercicio 9 unid. 14
-- 10 TUPLAS
INSERT INTO cientificos (dni, nomapels) VALUES 
    ('3333', 'Garcia'),
    ('2345', 'Esteve'),
    ('12345645', 'Dani'),
    ('657', 'Juan'),
    ('12376745', 'Pedro'),
    ('878787', 'Pepe'),
    ('444', 'Mar'),
    ('777', 'Marcos'),
    ('676', 'Teresa'),
    ('999', 'Marquitos');

INSERT INTO proyecto (id, nombre,Horas) VALUES 
    ('3333', 'Monte','2'),
    ('2345', 'Estrellas','5'),
    ('12345645', 'Cascada','7'),
    ('657', 'Galleta','3'),
    ('12376745', 'Bosque','1'),
    ('878787', 'Coche','9'),
    ('444', 'Mar','11'),
    ('777', 'Marcos','6'),
    ('676', 'Flores','8'),
    ('999', 'Volar','10');

INSERT INTO asignado_A (cientifico,proyecto) VALUES 
     ('3333', '2345'),
    ('2345', '878787'),
    ('12345645', '444'),
    ('657', '777'),
    ('12376745', '999'),
    ('878787', '12376745'),
    ('444', '3333'),
    ('777', '657'),
    ('676', '676'),
    ('999', '12345645');