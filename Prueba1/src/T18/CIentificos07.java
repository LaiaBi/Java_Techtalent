package T18;
import T18.Conexion;
public class CIentificos07 {
	public static void main(String[] args) {
		Conexion c = new Conexion();
		String db = "`Los Cientificos`";
		String tabla1 = "cientificos", tabla2 = "proyecto", tabla3 = "asignado_a";
		String atributos1 = "(" + "  `dni` varchar(8) NOT NULL,"
				+ "  `nom_apels` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,"
				+ "  PRIMARY KEY (`dni`)" + ")";
		String atributos2 = "(" + "  `id` char(4) NOT NULL,"
				+ "  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,"
				+ "  `horas` int(11) DEFAULT NULL," + "  PRIMARY KEY (`id`)" + ")";
		String atributos3 = "(" + "  `cientifico` varchar(8) NOT NULL," + "  `proyecto` char(4) NOT NULL,"
				+ "  PRIMARY KEY (`cientifico`,`proyecto`)," + "  KEY `fk_proyecto_asignado` (`proyecto`),"
				+ "  CONSTRAINT `fk_cientifico_asignado` FOREIGN KEY (`cientifico`) REFERENCES `cientificos` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "  CONSTRAINT `fk_proyecto_asignado` FOREIGN KEY (`proyecto`) REFERENCES `proyecto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE"
				+ ")";
		String values1 = "(`dni`, `nom_apels`) VALUES" + "	('0672523P', 'francisco')," + "	('0827137K', 'pedro'),"
				+ "	('3287390R', 'maria')," + "	('3374683Z', 'javier')," + "	('5478699Y', 'carlos'),"
				+ "	('7305597S', 'montse')," + "	('7357072Y', 'rosa')," + "	('7845859G', 'cristina'),"
				+ "	('7869261K', 'juan')," + "	('9861511N', 'ana');";
		String values2 = "(`id`, `nombre`, `horas`) VALUES" + "	('P001', 'p1', 10)," + "	('P002', 'p2', 20),"
				+ "	('P003', 'p3', 30)," + "	('P004', 'p4', 40)," + "	('P005', 'p5', 50),"
				+ "	('P006', 'p6', 60)," + "	('P007', 'p7', 70)," + "	('P008', 'p8', 80),"
				+ "	('P009', 'p9', 90)," + "	('P010', 'p10', 100);";
		String values3 = "(`cientifico`, `proyecto`) VALUES" + "	('0672523P', 'P005')," + "	('0827137K', 'P003'),"
				+ "	('3287390R', 'P002')," + "	('3374683Z', 'P009')," + "	('5478699Y', 'P007'),"
				+ "	('7305597S', 'P010')," + "	('7357072Y', 'P008')," + "	('7845859G', 'P004'),"
				+ "	('7869261K', 'P001')," + "	('9861511N', 'P006');";

		c.createDB(db);

		c.createTable(db, tabla1, atributos1);
		c.insertData(db, tabla1, values1);

		c.createTable(db, tabla2, atributos2);
		c.insertData(db, tabla2, values2);

		c.createTable(db, tabla3, atributos3);
		c.insertData(db, tabla3, values3);

		c.closeConnection();
	}
}

