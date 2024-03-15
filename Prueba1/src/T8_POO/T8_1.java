package T8_POO;
public class T8_1 {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;
    protected String DNI;
    private String peso;
    private String altura;
    

    // Constructor
    public void Persona(String nombre, int edad, String genero,String peso,String altura,String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso= peso;
        this.altura= altura;
        this.DNI= DNI;
    }

    // Métodos getter y setter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getAltura() {
        return altura;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    // Método para imprimir información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("DNI: " + DNI);
    }

    // Método para saludar
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    // Método para calcular la edad en años bisiestos
    public int calcularEdadEnBisiestos(int anioBisiesto) {
        return edad / 4 - edad / 100 + edad / 400;
    }
}
