--ejercicio 4 unid. 14
-- 10 TUPLAS
USE empleados
INSERT INTO departamentos (codigo, nombre,presupuesto) VALUES 
    (3333, 'Ventas',500),
    (2345, 'Marqueting',300),
    (12345645, 'Finanzas',700),
    (657, 'Recursos Humanos',400),
    (12376745, 'Produccion',600),
    (878787, 'Invest. & Desarrollo',800),
    (444, 'Tecnologia',900),
    (777, 'Logistica',450),
    (676,'Legal',350),
    (999, 'Atencion al Cliente',250);

INSERT INTO empleados (dni, nombre,apellidos,departamento) VALUES 
    ('3333', 'María','García',999),
    ('2345', 'Alejandro','Martinez',878787),
    ('12345645', 'Laura','Rodriguez',657),
    ('657', 'Carlos', 'Lopez',444),
    ('12376745', 'Andrea','Hernandez',12345645),
    ('878787', 'Javier', 'Perez',777),
    ('444', 'Ana', 'Sanchez',12376745),
    ('777', 'David','Gomez',444),
    ('676','Paula','Fernandez',2345),
    ('999', 'Sergio', 'Ruiz',676);

-- USE empleados --
-- 2.1 (solo apellidos empleados)
SELECT apellidos
FROM empleados;
--2.2(solo apellidos sin que se repitan,en mi caso no se repiten)
SELECT DISTINCT apellidos
FROM empleados;
--2.3(solo la info de la persona apellidada 'Lopez')
SELECT *
FROM empleados
WHERE apellidos = 'Lopez';
-- 2.4(solo la info de la persona con apellidos 'Lopez' y 'Perez')
SELECT *
FROM empleados
WHERE apellidos = 'Lopez' OR apellidos= 'Perez';
-- 2.5(info de empleados que trabajan en el pert. 14)
SELECT *
FROM empleados
WHERE departamento = 14;
-- 2.6(info de empleados que trabajan en el pert. 37 y 77)
SELECT *
FROM empleados
WHERE departamento IN (37, 77);
-- 2.7(datos de empleados que empiezen por 'P')
SELECT *
FROM personas
WHERE apellido LIKE 'P%';
--2.8 (presupuestod e todos los departamentos)
SELECT SUM(presupuesto) AS presupuesto_total
FROM departamentos;
-- 2.9 (num. empleados de cada departamaento)
SELECT departamento, COUNT(*) AS numero_empleados
FROM empleados
GROUP BY departamento;
-- 2.10 (listado de empleados,cada uno de sus datos y departamento)
SELECT *, departamento
FROM empleados;
-- 2.11 (listado de empleados, cada uno de sus datos y presupuesto de su departamento)
SELECT empleados.*, departamentos.presupuesto AS presupuesto_departamento
FROM empleados empleados
JOIN departamentos departamentos ON empleados.departamento = departamentos.codigo;
-- 2.12(nom. y apellidos de trabajadores en departamentos de presupuesto mayor a 60.000€)
SELECT empleados.nombre, empleados.apellidos
FROM empleados
JOIN departamentos ON empleados.departamento = departamentos.codigo
WHERE departamentos.presupuesto > 60000;
-- 2.13(datos de departamentos cuyo precio sea superior a la media)
SELECT *
FROM departamentos
WHERE presupuesto > (SELECT AVG(presupuesto) FROM departamentos);
-- 2.14(NOMBRES de los departamentos que tienen mas de dos empleados)
SELECT nombre
FROM departamentos
WHERE id IN (
    SELECT departamento
    FROM empleados
    GROUP BY departamento
    HAVING COUNT(*) > 2);
--2.15(Añadir'CALIDAD', 40.000 y cod.11. Empleado:Esther Vazquez, dni: 89267109)
INSERT INTO departamentos (codigo, nombre,presupuesto) VALUES 
    (11, 'CALIDAD',40.000);
INSERT INTO empleados (dni, nombre,apellidos,departamento) VALUES 
    ('89267109', 'Esther','Vazquez',676);
-- 2.16(recorte de presupuesto del 10% a todos los depart.)
UPDATE departamentos
SET presupuesto = presupuesto * 0.9;
-- 2.17(reasignar empleados de departamento de investigacion a los de informatica)
UPDATE empleados
SET departamento = 4
WHERE departamento = 9
--2.18(despedir a todos los empleados de depart. informatica)
DELETE
FROM empleados
WHERE departamento = 4
-- 2.19 (despedir empleados que trabajen en un lugar de presup. superior a 60.000€)
DELETE FROM empleados
WHERE departamento IN 
(
    SELECT codigo
    FROM departamentos
    WHERE presupuesto >= 18000
);
-- 2.20 (despedir todos)
DELETE
FROM empleados 