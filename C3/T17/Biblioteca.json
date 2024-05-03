-- Crear la base de datos
CREATE DATABASE Biblioteca;
-- Usar la base de datos creada
USE Biblioteca;
-- Crear la tabla de libros
CREATE TABLE Libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    fecha_lanzamiento DATE,
    autor VARCHAR(255),
    categoria VARCHAR(100),
    editorial VARCHAR(100),
    idioma VARCHAR(50),
    paginas INT,
    descripcion TEXT,
    portada VARCHAR(255)
);
-- Datos:
INSERT INTO Libros (titulo, fecha_lanzamiento, autor, categoria, editorial, idioma, paginas, descripcion, portada) VALUES
    ('El Señor de los Anillos', '1954-07-29', 'J.R.R. Tolkien', 'Fantasía', 'Minotauro', 'Español', 1200, 'Una épica historia de fantasía que sigue las aventuras de un grupo de personajes en su búsqueda para destruir un poderoso anillo.', 'portada_senior_anillos.jpg'),
    ('Cien años de soledad', '1967-05-30', 'Gabriel García Márquez', 'Realismo mágico', 'Sudamericana', 'Español', 432, 'La saga de la familia Buendía a lo largo de varias generaciones en el ficticio pueblo de Macondo.', 'portada_cien_anos_soledad.jpg'),
    ('Harry Potter y la piedra filosofal', '1997-06-26', 'J.K. Rowling', 'Fantasía', 'Salamandra', 'Español', 256, 'La historia de un niño huérfano que descubre que es un mago y es admitido en la Escuela de Magia y Hechicería de Hogwarts.', 'portada_harry_potter_piedra_filosofal.jpg');
