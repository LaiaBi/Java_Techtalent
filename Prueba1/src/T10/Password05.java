package T10;

public class Password05 {
	private int longitud;
    private String contraseña;

    // Constructor que establece la longitud por defecto en 8
    public Password05() {
        this.longitud = 8;
        generarContraseña();
    }

    // Constructor que permite establecer la longitud
    public Password05(int longitud) {
        this.longitud = longitud;
        generarContraseña();
    }

    // Método para generar la contraseña aleatoria
    private void generarContraseña() {
        // Definimos los caracteres que pueden formar parte de la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=-";

        // Creamos un StringBuilder para construir la contraseña
        StringBuilder sb = new StringBuilder();

        // Generamos la contraseña aleatoria
        for (int i = 0; i < longitud; i++) {
            int index = (int) (Math.random() * caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        // Asignamos la contraseña generada
        contraseña = sb.toString();
    }

    	// Método para verificar si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        // Contar el número de mayúsculas, minúsculas y números en la contraseña
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        // Verificar si la contraseña es fuerte
        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    // Métodos para acceder a la contraseña y la longitud
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }
    public int setLongitud() {
        return longitud;
    }
}