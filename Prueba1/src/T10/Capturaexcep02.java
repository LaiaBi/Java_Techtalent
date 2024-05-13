package T10;
public class Capturaexcep02 {

	public static void main(String[] args) {

		boolean excepcionCapturada = false;

		while (!excepcionCapturada) {
			try {
				System.out.println("Mensaje mostrado por pantalla.");
				throw new excep02App("Esto es un objeto Excepcion.");
			} catch (excep02App e) {
				System.out.println("Se capturó la excepción: " + e.getMensaje());
				excepcionCapturada = true;
			}
		}
	}
}