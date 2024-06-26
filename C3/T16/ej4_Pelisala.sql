--ejercicio 6 unid. 14
-- 10 TUPLAS
USE PeliSala;
INSERT INTO peliculas (codigo, nombre, clasifEdad) VALUES 
    (3333, 'Toy Story', 'AP'),
    (2345, 'Jurassic Park', '12'),
    (12345645, 'The Lord of the Rings: The Fellowship of the Ring', '13'),
    (657, 'The Dark Knight', '14'),
    (12376745, 'Inception', '14'),
    (878787, 'The Shawshank Redemption', '16'),
    (444, 'Pulp Fiction', '16'),
    (777, 'Fight Club', '18'),
    (676, 'The Godfather', '18'),
    (999, 'Schindler''s', '18');

INSERT INTO salas (codigo, nombre, pelicula) VALUES 
    (3333, '1', 999),
    (2345, '8', 676),
    (12345645, '5',777),
    (657, '3', 878787),
    (12376745, '3', 657),
    (878787, '6', 3333),
    (444, '4', 12345645),
    (777, '2', 2345),
    (676, '1', 12376745),
    (999, '5', 444);

-- 4.1 (mostrar nom. todas las pelis)
SELECT * FROM peliculas;
-- 4.2 (distintas calificaciones de edad)
SELECT DISTINCT clasifEdad FROM peliculas;
-- 4.3 (todas pelis no calificadas)
SELECT * FROM peliculas
WHERE clasifEdad IS NULL;
-- 4.4 (todas las salas que no proyectan ninguna peli)
SELECT s.*
FROM salas s
LEFT JOIN peliculas p ON s.codigo = pelicula
WHERE pelicula IS NULL;
-- 4.5 (info. de todas las salas, la peli e info de la peli)
SELECT s.codigo AS codigo_sala, 
       s.nombre AS nombre_sala, 
       p.nombre AS nombre_pelicula, 
       p.clasifEdad AS clasificacion_edad_pelicula
FROM salas s
LEFT JOIN peliculas p ON s.pelicula = p.codigo;
-- 4.6 (info de todas las pelis y si se proyecta en alguna sala e info de ella)
SELECT p.codigo AS codigo_pelicula, 
       p.nombre AS nombre_pelicula, 
       p.clasifEdad AS clasificacion_edad_pelicula,
       s.codigo AS codigo_sala, 
       s.nombre AS nombre_sala
FROM peliculas p
LEFT JOIN salas s ON p.codigo = s.pelicula;
-- 4.7 (nombres de peli que no se proyecta en ninguna sala)
SELECT p.nombre AS nombre_pelicula
FROM peliculas p
LEFT JOIN salas s ON p.codigo = s.pelicula
WHERE s.pelicula IS NULL;
-- 4.8 (NUEVA peli 'Uno, Dos, Tres', mayores de 7)
INSERT INTO peliculas (codigo, nombre, clasifEdad) VALUES 
    (1234, 'Uno, Dos, Tres', '7');
-- 4.9 (todas las no calificadas han sido alificadas 'no reco-mendables para menores de 13 años')
UPDATE peliculas
SET clasifEdad = 'no recomendables para menores de 13 años'
WHERE clasifEdad IS NULL;
-- 4.10 (eliminar todas las salas)
DELETE FROM salas;