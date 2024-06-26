package T18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import T18.Conexion;

public class TiendaInform01 {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		//ceacion de la tienda
		String db = "`La Tienda de Informatica`";
		//informacion de las tablas
		String tabla1 = "articulos", tabla2 = "fabricantes";
		String atributos1 = "(" + "  `codigo` int(11) NOT NULL AUTO_INCREMENT,"
				+ "  `nombre` varchar(100) DEFAULT NULL," + "  `precio` int(11) DEFAULT NULL,"
				+ "  `fabricante` int(11) DEFAULT NULL," + "  PRIMARY KEY (`codigo`),"
				+ "  KEY `FK_articulos_fabricantes` (`fabricante`),"
				+ "  CONSTRAINT `FK_articulos_fabricantes` FOREIGN KEY (`fabricante`) REFERENCES `fabricantes` "
				+ "(`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
				+ ")";
		String atributos2 = "(" + "  `codigo` int(11) NOT NULL AUTO_INCREMENT,"
				+ "  `nombre` varchar(100) DEFAULT NULL," + "  PRIMARY KEY (`codigo`)" + ") ";
		String values2 = "(`codigo`, `nombre`) VALUES" + "	(1, 'f1')," + "	(2, 'f2')," + "	(3, 'f3')," + "	(4, 'f4'),"
				+ "	(5, 'f5')," + "	(6, 'f6')," + "	(7, 'f7')," + "	(8, 'f8')," + "	(9, 'f9')," + "	(10, 'f10');";
		String values1 = "(`codigo`, `nombre`, `precio`, `fabricante`) VALUES" + "	(1, 'a1', 9, 1),"
				+ "	(2, 'a2', 18, 2)," + "	(3, 'a3', 27, 3)," + "	(4, 'a4', 36, 4)," + "	(5, 'a5', 45, 5),"
				+ "	(6, 'a6', 54, 6)," + "	(7, 'a7', 63, 7)," + "	(8, 'Impresora Laser', 72, 8),"
				+ "	(9, 'a9', 81, 9)," + "	(10, 'a10', 90, 10)," + "	(11, 'a11', 170, 3),"
				+ "	(12, 'Altavoz', 63, 2);";
		//comandos adjuntos para ejecutarlo
		c.createDB(db);

		c.createTable(db, tabla2, atributos2);
		c.insertData(db, tabla2, values2);

		c.createTable(db, tabla1, atributos1);
		c.insertData(db, tabla1, values1);

		c.closeConnection();
	}

}