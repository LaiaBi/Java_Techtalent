package T18;
import T18.Conexion;
public class Directores05 {
	public static void main(String[] args) {
		Conexion c = new Conexion();
		String db = "`Los Directores`";
		String tabla1 = "despachos", tabla2 = "directores";
		String atributos1 = "(" + "  `numero` int(11) NOT NULL," + "  `capacidad` int(11) DEFAULT NULL,"
				+ "  PRIMARY KEY (`numero`)" + ")";
		String atributos2 = "(" + "  `dni` varchar(8) NOT NULL,"
				+ "  `nom_apels` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,"
				+ "  `dni_jefe` varchar(8) DEFAULT NULL," + "  `despacho` int(11) DEFAULT NULL,"
				+ "  PRIMARY KEY (`dni`)," + "  KEY `fk_despachos_directores` (`despacho`),"
				+ "  KEY `fk_directores_directores` (`dni_jefe`),"
				+ "  CONSTRAINT `fk_despachos_directores` FOREIGN KEY (`despacho`) REFERENCES `despachos` (`numero`) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "  CONSTRAINT `fk_directores_directores` FOREIGN KEY (`dni_jefe`) REFERENCES `directores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE"
				+ ")";
		String values1 = "(`numero`, `capacidad`) VALUES" + "	(1, 10)," + "	(2, 20)," + "	(3, 30),"
				+ "	(4, 40)," + "	(5, 50)," + "	(6, 60)," + "	(7, 70)," + "	(8, 80)," + "	(9, 90),"
				+ "	(10, 100);";
		String values2 = "(`dni`, `nom_apels`, `dni_jefe`, `despacho`) VALUES" + "	('0672523P', 'francisco', NULL, 9),"
				+ "	('0827137K', 'pedro', NULL, 2)," + "	('3287390R', 'maria', NULL, 1),"
				+ "	('3374683Z', 'javier', NULL, 6)," + "	('5478699Y', 'carlos', NULL, 4),"
				+ "	('7305597S', 'montse', NULL, 5)," + "	('7357072Y', 'rosa', '5478699Y', 4),"
				+ "	('7869261K', 'juan', NULL, 3)," + "	('7845859G', 'cristina', '7869261K', 3),"
				+ "	('9861511N', 'ana', '0672523P', 9);";

		c.createDB(db);

		c.createTable(db, tabla1, atributos1);
		c.insertData(db, tabla1, values1);

		c.createTable(db, tabla2, atributos2);
		c.insertData(db, tabla2, values2);

		c.closeConnection();
	}

}

