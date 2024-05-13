package T10;

public class excep02App extends Exception {
	
	private String mensaje;
	
	public excep02App(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}