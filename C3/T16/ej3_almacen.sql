--ejercicio 5 unid. 14
-- 10 TUPLAS
USE almacenes
INSERT INTO almacenes (codigo, lugar,capacidad) VALUES 
    (3333, 'Murcia',500),
    (2345, 'Andorra',300),
    (12345645, 'Tarragona',700),
    (657, 'Sevilla',400),
    (12376745, 'Vinaroz',600),
    (878787, 'Madrid',800),
    (444, 'Tortosa',900),
    (777, 'Bilbao',450),
    (676,'Salou',350),
    (999, 'Barcelona',250);

INSERT INTO cajas (numreferencia, contenido,valor,almacen) VALUES 
    ('3333', 'Ventas',500,444),
    ('2345', 'Marqueting',300,999),
    ('12345645', 'Finanzas',700,878787),
    ('657', 'Recursos Humanos',400,657),
    ('12376745', 'Produccion',600,676),
    ('878787', 'Invest. & Desarrollo',800,3333),
    ('444', 'Tecnologia',900,2345),
    ('777', 'Logistica',450,12376745),
    ('676','Legal',350,12345645),
    ('999', 'Atencion al Cliente',250,777);

--USE almacenes--
-- 3.1 (todos los almacenes)
SELECT *
FROM almacenes;
-- 3.2 (todas las caajas valor superior de 150€)
SELECT *
FROM cajas
WHERE valor > 150;
-- 3.3 (tipos de contenido de cajas)
SELECT DISTINCT contenido
FROM cajas;
-- 3.4 (valor medio de todas las cajas)
SELECT AVG(valor) AS valor_medio
FROM cajas;
-- 3.5 (valor medio de las cajas de cada almacen)
SELECT a.codigo AS codigo_almacen, a.lugar, AVG(c.valor) AS valor_medio_cajas
FROM almacenes a
LEFT JOIN cajas c ON a.codigo = c.almacen
GROUP BY a.codigo, a.lugar;
-- 3.6 ????(codigos de almacenes de valor de caja superior a 150€)????
SELECT DISTINCT almacen_id
FROM cajas
WHERE valor > 150;
-- 3.7 (num.referencia de cada caja con el nombre de la ciudad)-???
SELECT cajas.numreferencia, almacenes.lugar
FROM cajas cajas
JOIN almacenes almacenes ON cajas.numreferencia = almacenes.codigo;
-- 3.8???? (num.cajas que hay en el almacen)???
SELECT almacen_id, COUNT(*) AS numero_de_cajas
FROM cajas
GROUP BY almacen_id;
-- 3.9 (codig. almacenes saturados(superior a su capacidad))????
SELECT almacen_codigo
FROM cajas
GROUP BY almacen_codigo
HAVING COUNT(*) > (SELECT capacidad FROM almacenes WHERE numreferencia = almacen_codigo);
-- 3.10 (num. referencia de las cajas de 'Bilbao')???? (cajas.almacenes_codigo)
SELECT cajas.numreferencia
FROM cajas
JOIN almacenes ON cajas.almacenes_codigo = almacenes.codigo
WHERE almacenes.lugar = 'Bilbao';
-- 3.11 (NUEVO almacen en Barcelona con capacidad de 3)
INSERT INTO almacenes (codigo, lugar,capacidad) VALUES 
    (545, 'Barcelona',3);
-- 3.12?? (NUEVA caja, num. refer. 'H5RT', de 'Papel', valor 200 situada en alm.2)??
INSERT INTO cajas (numreferencia, contenido,valor,almacen) VALUES 
    ('H5RT', 'Papel',200,2);
-- 3.13 (rebajar el valor de las cajas a un 15%)
UPDATE cajas
SET valor = valor * 0.85; -- Multiplicar por 0.85 para reducir en un 15%
-- 3.14 (rebajar 20% el valor de las cajas con valor superior al medio total)
UPDATE cajas
SET valor = valor * 0.8 -- Multiplicar por 0.8 para reducir en un 20%
WHERE valor > (
    SELECT AVG(valor) FROM cajas
);
-- 3.15 (eliminar todas cajas inferiores a 100€)
DELETE FROM cajas
WHERE valor < 100;
-- 3.16 (vaciar el contenido de almacenes que estan saturados)