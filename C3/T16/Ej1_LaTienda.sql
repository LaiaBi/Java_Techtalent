--ejercicio 3 unid. 14
-- 10 TUPLAS
USE tienda_informatica
INSERT INTO fabricantes (codigo, nombre) VALUES 
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

INSERT INTO articulos (codigo, nombre,precio,fabricante) VALUES 
    (3333, 'Altavoz',80,999),
    (2345, 'Cámara digital Canon',354,676),
    (12345645, 'Auriculares inalámbricos Sony',243,777),
    (657, 'Tablet Apple',599,2345),
    (12376745, 'Impresora multifunción',249,3333),
    (878787, 'Reloj inteligente',399,444),
    (444, 'Altavoz inteligente',49,12345645),
    (777, 'Consola de videojuegos Xbox',499,657),
    (676, 'Smart TV',1119,12376745),
    (999, 'Laptop HP Pavilion 15.6"',800,878787);

-- USE tienda_informatica --
-- 1.1 (La única cosa que da error es que la columna nombre sale doble,es decir que al mostrar la columna sale doblada)
SELECT nombre,nombre
FROM articulos;
-- 1.2 (Seleccionar nombre del producto y el precio)
SELECT nombre,precio
FROM articulos;
-- 1.3 ( producto de precio menor o igual a 200€, 0 si no cumple con la selección)
SELECT nombre,precio <= 200
FROM articulos;
-- 1.4 (entre 60 y 120, las dos incluidas, al no tener las cualidades que indica no se incluye en la lista)
SELECT * FROM articulos
WHERE precio BETWEEN 60 AND 120;
-- 1.5(en pesetas ( € *166,386))
SELECT nombre,precio *166.386 AS precio_pesetas 
FROM articulos;
-- 1.6(Precio medio de productos)
SELECT AVG(precio) AS precio_medio
FROM articulos;
-- 1.7(precio medio cuyo codigo fabricante sea 2, al no tener (NULL))
SELECT AVG(precio) AS precio_medio
FROM articulos
WHERE codigo = 2;
-- 1.8(num. articulos igual o mayor a 180€)
SELECT nombre,precio >= 180
FROM articulos;
-- 1.9(num. articulos igual o mayor a 180€,ordenados de menos a mas y a la inversa)
SELECT *
FROM articulos
WHERE precio >= 180
ORDER BY precio ASC; 
-- (INVERSA)
SELECT *
FROM articulos
WHERE precio >= 180
ORDER BY precio DESC;
-- 1.10 (ver todo la info completa de los articulos)
SELECT articulos.codigo, articulos.nombre, precio, fabricante, fabricantes.nombre AS nombre_fabricante
FROM articulos
INNER JOIN fabricantes ON fabricante = fabricantes.codigo;
-- 1.11 (ver todo la info completa de los articulos)
SELECT articulos.nombre, precio, fabricantes.nombre AS nombre_fabricante
FROM articulos
INNER JOIN fabricantes ON fabricante = fabricantes.codigo;
-- 1.12 (precio medio de los productos y solo mostrar el codigo del fabricante)
SELECT codigo, AVG(precio) AS precio_medio
FROM articulos
GROUP BY codigo;
-- 1.13(precio medio de cada producto del fabricante(mostrando el nom. del mismo))
SELECT fabricante, fabricantes.nombre, SUM(precio)/COUNT(precio) AS precio_medio
FROM articulos
INNER JOIN fabricantes ON fabricante = fabricantes.codigo
GROUP BY fabricante
-- 1.14(nombre de los fabricantes con productos medios de mayor o igual a 150€)
SELECT articulos.fabricante, fabricantes.nombre, SUM(articulos.precio)/COUNT(articulos.precio) AS precio_medio
FROM fabricantes
INNER JOIN articulos ON articulos.fabricante = fabricantes.codigo
WHERE (
	SELECT SUM(precio)/COUNT(precio)
	FROM articulos
	WHERE fabricante = fabricantes.codigo
	GROUP BY fabricante
) >= 80
GROUP BY articulos.fabricante
-- 1.15 (nombre y precio de articulos baratos)
SELECT nombre, precio
FROM articulos
WHERE precio <= 50;
-- 1.16 (nombre y precio de articulos mas caros de cada proveedor (incluido su nombre))
SELECT fabricantes.nombre AS nombre_proveedor, 
       articulos.nombre AS nombre_articulo, 
       articulos.precio
FROM articulos
JOIN fabricantes ON articulos.codigo = fabricantes.codigo
WHERE articulos.precio = (
    SELECT MAX(precio)
    FROM articulos
);
-- 1.17(Nuevo producto)
INSERT INTO articulos (codigo, nombre,precio,fabricante) VALUES
    (910,'Altavoces',70,657);
-- 1.18(Cambiar articulo 8 a 'Impresora Laser')
UPDATE articulos
SET nombre = 'Impresora Laser'
WHERE codigo = 3333;
-- 1.19(descuento del 10% en todos los productos)
UPDATE articulos
SET precio = precio * 0.9;
-- 1.20 (descuento de 10€ a productos mayores o igual a 120€)
UPDATE articulos
SET precio = precio - 10
WHERE precio >= 120;