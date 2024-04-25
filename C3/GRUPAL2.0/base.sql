CREATE DATABASE comercio_jalal ;
USE comercio_jalal; 

CREATE TABLE proveedores(
    id_proveedor INT AUTO_INCREMENT, 
    PRIMARY KEY (id_proveedor), 
    nombre VARCHAR(200) NOT NULL
);

CREATE TABLE productos(
    id_producto INT, 
    PRIMARY KEY (id_producto), 
    nombre VARCHAR(80), 
    precio FLOAT(5,2), 
    IVA FLOAT(5,2) CHECK (IVA=0.04 OR IVA=0.21),
    id_proveedor INT, 
    FOREIGN KEY (id_proveedor) 
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE inventario(
    id_proveedor INT, 
    FOREIGN KEY (id_proveedor)
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    cantidad INT NOT NULL, 
    id_producto INT, 
    FOREIGN KEY (id_producto)
    REFERENCES productos (id_producto)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE caja(
    num_caja INT AUTO_INCREMENT, 
    PRIMARY KEY (num_caja),
    id_producto INT, 
    FOREIGN KEY (id_producto)
    REFERENCES productos (id_producto)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    cantidad INT NOT NULL, 
    precio_producto FLOAT, 
    IVA FLOAT(5,2) CHECK (IVA=0.04 OR IVA=0.21)
    );

CREATE TABLE ticket(
    id_ticket INT AUTO_INCREMENT, 
    PRIMARY KEY (id_ticket), 
    num_caja INT, 
    FOREIGN KEY (num_caja)
    REFERENCES caja (num_caja)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    precio_total FLOAT 
    
);

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT, 
    PRIMARY KEY (id_cliente),
    nombre VARCHAR(80), 
    apellidos VARCHAR (80),
    e_mail VARCHAR(150) UNIQUE NOT NULL, 
    id_ticket INT, 
    FOREIGN KEY (id_ticket)
    REFERENCES ticket (id_ticket)
    ON DELETE CASCADE
    ON UPDATE CASCADE
); 
--RELLENAR--
-- Datos para la tabla proveedores
INSERT INTO proveedores (nombre) VALUES
('Samsung Electronics'),
('Apple Inc.'),
('Sony Corporation'),
('LG Electronics'),
('Microsoft Corporation');

-- Datos para la tabla productos
INSERT INTO productos (id_producto, nombre, precio, IVA, id_proveedor) VALUES
('001', 'Samsung Galaxy S21', 999.99, 0.21, 1),
('002', 'iPhone 13', 1099.00, 0.21, 2),
('003', 'PlayStation 5', 499.99, 0.21, 3),
('004', 'LG OLED TV', 1599.00, 0.21, 4),
('005', 'Microsoft Surface Laptop 4', 1299.99, 0.21, 5);

-- Datos para la tabla inventario
INSERT INTO inventario (id_proveedor, cantidad, id_producto) VALUES
(1, 50, 1),
(2, 40, 2),
(3, 30, 3),
(4, 20, 4),
(5, 35, 5);

-- Datos para la tabla caja
INSERT INTO caja (id_producto, cantidad, precio_producto, IVA) VALUES
(1, 5, 999.99, 0.21),
(2, 7, 1099.00, 0.21),
(3, 3, 499.99, 0.21),
(4, 2, 1599.00, 0.21),
(5, 4, 1299.99, 0.21);

-- Datos para la tabla ticket
INSERT INTO ticket (num_caja, precio_total) VALUES
(1, 5049.94),
(2, 7693.93),
(3, 1549.97),
(4, 3298.00),
(5, 5199.96);

-- Datos para la tabla clientes
INSERT INTO clientes (nombre, apellidos, e_mail, id_ticket) VALUES
('Roberto', 'Fernández', 'roberto.fernandez@example.com', 1),
('Laura', 'Gómez', 'laura.gomez@example.com', 2),
('Miguel', 'Ramírez', 'miguel.ramirez@example.com', 3),
('Isabel', 'Pérez', 'isabel.perez@example.com', 4),
('Carlos', 'Torres', 'carlos.torres@example.com', 5);