package T18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import T18.Conexion;
public class Almacenes03 {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		//ceacion de Almacenes
		String db = "`Almacenes`";
		//informacion de las tablas
		String tabla1 = "almacenes", tabla2 = "cajas";
		String atributos1 = "(" + "  `codigo` int(11) NOT NULL,"
				+ "  `lugar` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,"
				+ "  `capacidad` int(11) DEFAULT NULL," + "  PRIMARY KEY (`codigo`)" + ") ";
		String atributos2 = "(" + "  `num_referencia` char(5) NOT NULL,"
				+ "  `contenido` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,"
				+ "  `valor` int(11) DEFAULT NULL," + "  `almacen` int(11) DEFAULT NULL,"
				+ "  PRIMARY KEY (`num_referencia`)," + "  KEY `fk_cajas_almacenes` (`almacen`),"
				+ "  CONSTRAINT `fk_cajas_almacenes` FOREIGN KEY (`almacen`) REFERENCES `almacenes` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
				+ ")";
		String values1 = "(`codigo`, `lugar`, `capacidad`) VALUES" + "	(1, 'Nueva York', 200),"
				+ "	(2, 'Los Ángeles', 150)," + "	(3, 'Chicago', 180)," + "	(4, 'Houston', 170),"
				+ "	(5, 'Phoenix', 160)," + "	(6, 'Filadelfia', 190)," + "	(7, 'San Antonio', 220),"
				+ "	(8, 'San Diego', 210)," + "	(9, 'Dallas', 230)," + "	(10, 'San José', 240),"
				+ "	(11, 'Ciudad Nueva', 1)," + "	(12, 'Barcelona', 3);";
		String values2 = "(`num_referencia`, `contenido`, `valor`, `almacen`) VALUES"
				+ "	('A001', 'Documentos', 136, 1)," + "	('B002', 'Electrónicos', 204, 2),"
				+ "	('C003', 'Ropa', 128, 3)," + "	('D004', 'Herramientas', 170, 4),"
				+ "	('E005', 'Juguetes', 102, 5)," + "	('F006', 'Libros', 153, 6),"
				+ "	('G007', 'Artículos de cocina', 145, 7)," + "	('H008', 'Cosméticos', 150, 8),"
				+ "	('H5RT', 'Papel', 136, 2)," + "	('I009', 'Comestibles', 162, 9),"
				+ "	('J010', 'Artículos de oficina', 136, 10)," + "	('K011', 'Equipos deportivos', 190, 1),"
				+ "	('L012', 'Electrodomésticos', 340, 2)," + "	('M013', 'Instrumentos musicales', 238, 3),"
				+ "	('N014', 'Accesorios para el hogar', 153, 4)," + "	('O015', 'Productos de limpieza', 136, 5),"
				+ "	('P016', 'Material de embalaje', 43, 6)," + "	('P017', 'Artículos pequeños', 17, 11),"
				+ "	('Q018', 'Objetos frágiles', 26, 11);";

		//comandos adjuntos para ejecutarlo
		c.createDB(db);

		c.createTable(db, tabla2, atributos2);
		c.insertData(db, tabla2, values2);

		c.createTable(db, tabla1, atributos1);
		c.insertData(db, tabla1, values1);

		c.closeConnection();
	}

}
