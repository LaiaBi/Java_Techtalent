package T9_Herencia;

public class T9_1ElecMain {
	public static void main(String[] args) {
		T9_1_Elecrtrodomestico1 electrodomestico1 = new T9_1_Elecrtrodomestico1();
        System.out.println("Electrodomestico 1:");
        System.out.println(electrodomestico1);
        System.out.println("Precio final: " + electrodomestico1.precioFinal() + " €");

        T9_1_Elecrtrodomestico1 electrodomestico2 = new T9_1_Elecrtrodomestico1();
        System.out.println("\nElectrodomestico 2:");
        System.out.println(electrodomestico2);
        System.out.println("Precio final: " + electrodomestico2.precioFinal() + " €");

        T9_1_Elecrtrodomestico1 electrodomestico3 = new T9_1_Elecrtrodomestico1();
        System.out.println("\nElectrodomestico 3:");
        System.out.println(electrodomestico3);
        System.out.println("Precio final: " + electrodomestico3.precioFinal() + " €");
        
        T9_1_Lavadora lavadora1 = new T9_1_Lavadora();
        System.out.println("Lavadora 1:");
        System.out.println(lavadora1);
        System.out.println("Precio final: " + lavadora1.precioFinal() + " €");

        T9_1_Lavadora lavadora2 = new T9_1_Lavadora(150, 7);
        System.out.println("\nLavadora 2:");
        System.out.println(lavadora2);
        System.out.println("Precio final: " + lavadora2.precioFinal() + " €");

        T9_1_Lavadora lavadora3 = new T9_1_Lavadora();
        System.out.println("\nLavadora 3:");
        System.out.println(lavadora3);
        System.out.println("Precio final: " + lavadora3.precioFinal() + " €");
        
        T9_1_Television television1 = new T9_1_Television();
        System.out.println("Televisión 1:");
        System.out.println(television1);
        System.out.println("Precio final: " + television1.precioFinal() + " €");

        T9_1_Television television2 = new T9_1_Television(150, 7);
        System.out.println("\nTelevisión 2:");
        System.out.println(television2);
        System.out.println("Precio final: " + television2.precioFinal() + " €");

        T9_1_Television television3 = new T9_1_Television(50, true, 200, 8, "azul", 'A');
        System.out.println("\nTelevisión 3:");
        System.out.println(television3);
        System.out.println("Precio final: " + television3.precioFinal() + " €");
    }
}
