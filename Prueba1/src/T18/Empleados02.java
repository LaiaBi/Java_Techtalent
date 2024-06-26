package T18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import T18.Conexion;
public class Empleados02 {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		//ceacion de Empleados
		String db = "`Empleados`";
		//informacion de las tablas
		String tabla1 = "empleados", tabla2 = "departamentos";
		String atributos1 = "(" + "  `codigo` int(11) NOT NULL AUTO_INCREMENT,"
				+ "  `nombre` varchar(100) DEFAULT NULL," + "  `presupuesto` int(11) DEFAULT NULL,"
				+ "  PRIMARY KEY (`codigo`)" + ")";
		String atributos2 = "(" + "  `dni` varchar(8) NOT NULL," + "  `nombre` varchar(100) DEFAULT NULL,"
				+ "  `apellidos` varchar(255) DEFAULT NULL," + "  `departamento` int(11) DEFAULT NULL,"
				+ "  PRIMARY KEY (`dni`)," + "  KEY `FK_empleados_departamentos` (`departamento`),"
				+ "  CONSTRAINT `FK_empleados_departamentos` FOREIGN KEY (`departamento`) REFERENCES `departamentos` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
				+ ")";
		String values1 = "(`codigo`, `nombre`, `presupuesto`) VALUES" + "	(1, 'Ventas', 9000),"
				+ "	(2, 'Marketing', 13500)," + "	(3, 'Recursos Humanos', 10800)," + "	(4, 'Desarrollo', 18000),"
				+ "	(5, 'Finanzas', 16200)," + "	(6, 'Producción', 22500)," + "	(7, 'Logística', 15300),"
				+ "	(8, 'Calidad', 11700)," + "	(9, 'Investigación', 19800)," + "	(10, 'Administración', 17100),"
				+ "	(11, 'Calidad2', 36000);";
		String values2 = "(`dni`, `nombre`, `apellidos`, `departamento`) VALUES"
				+ "	('01234567', 'Elena', 'Díaz', 10)," + "	('11223344', 'Alejandro', 'Hernández', 1),"
				+ "	('12345678', 'Juan', 'Pérez', 1)," + "	('22334455', 'Patricia', 'Santos', 2),"
				+ "	('23456789', 'María', 'García', 2)," + "	('33445566', 'Javier', 'Vargas', 3),"
				+ "	('34567890', 'Carlos', 'López', 3)," + "	('44556677', 'Isabel', 'Fuentes', 4),"
				+ "	('45678901', 'Laura', 'Martínez', 4)," + "	('55667788', 'Daniel', 'Moreno', 5),"
				+ "	('56789012', 'Pedro', 'Sánchez', 5)," + "	('67890123', 'Ana', 'Rodríguez', 6),"
				+ "	('78901234', 'David', 'Fernández', 7)," + "	('89012345', 'Sofía', 'Ruiz', 8),"
				+ "	('89267109', 'Esther', 'Vázquez', 11)," + "	('90123456', 'Luis', 'Gómez', 4);";
		//comandos adjuntos para ejecutarlo
				c.createDB(db);

				c.createTable(db, tabla2, atributos2);
				c.insertData(db, tabla2, values2);

				c.createTable(db, tabla1, atributos1);
				c.insertData(db, tabla1, values1);

				c.closeConnection();
}
}