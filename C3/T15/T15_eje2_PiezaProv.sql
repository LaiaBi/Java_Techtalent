--ejercicio 8 unid. 14
-- 10 TUPLAS
USE piezasproveedor
INSERT INTO piezas (codigo, nombre) VALUES 
    (3333, 'Monte'),
    (2345, 'Torre'),
    (12345645, 'Caballo'),
    (657, 'Alfil'),
    (12376745, 'Reina'),
    (878787, 'Rey'),
    (444, 'Dama'),
    (777, 'Treza'),
    (676, 'Manzana'),
    (999, 'Centro');
INSERT INTO proveedores (id, nombre) VALUES 
    (3333, 'Garcia'),
    (2345, 'Esteve'),
    (12345645, 'Dani'),
    (657, 'Juan'),
    (12376745, 'Pedro'),
    (878787, 'Pepe'),
    (444, 'Mar'),
    (777, 'Marcos'),
    (676,'Teresa'),
    (999, 'Marquitos');
INSERT INTO suministra (codigoPieza,idProveedor,precio) VALUES 
    (3333, 12376745,4),
    (2345, 878787,23),
    (12345645, 444,3),
    (657,777,10),
    (12376745, 657,9),
    (878787, 12345645,13),
    (444, 999,6),
    (777, 3333,5),
    (676, 676,3),
    (999, 2345,11);