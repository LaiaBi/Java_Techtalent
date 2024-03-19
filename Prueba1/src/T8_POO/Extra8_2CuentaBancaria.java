package T8_POO;

public class Extra8_2CuentaBancaria {
	// Atributos
		private String numerocuenta;
		private int saldo;
		 private double saldo;


		    public CuentaBancaria(double saldoInicial) {
		        this.saldo = saldoInicial;
		    }

		    public void depositar(double cantidad) {
		        saldo += cantidad;
		        System.out.println("Se ha depositado " + cantidad + " unidades.");
		    }

		    public void retirar(double cantidad) {
		        if (saldo >= cantidad) {
		            saldo -= cantidad;
		            System.out.println("Se ha retirado " + cantidad + " unidades.");
		        } else {
		            System.out.println("Saldo insuficiente.");
		        }
		    }

		    public double getSaldo() {
		        return saldo;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Ingrese el saldo inicial de la cuenta: ");
		        double saldoInicial = scanner.nextDouble();

		        CuentaBancaria cuenta = new CuentaBancaria(saldoInicial);

		        System.out.print("Ingrese la cantidad a depositar: ");
		        double deposito = scanner.nextDouble();
		        cuenta.depositar(deposito);

		        System.out.print("Ingrese la cantidad a retirar: ");
		        double retiro = scanner.nextDouble();
		        cuenta.retirar(retiro);

		        System.out.println("El saldo actual es: " + cuenta.getSaldo());

		        scanner.close();
		    }
		}

}
