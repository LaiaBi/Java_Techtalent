package AppMain;
import java.sql.Connection;
public class MainCliente {
	public static void main(String[] args) {

        Conexion conexion = new Conexion();
        conexion.connect();
        Connection conexion = conexion.getConnection();
        
        ViewCliente clientesView = new ViewCliente();
        ControllerCliente controller = new ControllerCliente(clientesView, conexion);
    }

}