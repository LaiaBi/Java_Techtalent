package T9_Herencia;

public class T9_1_Television extends T9_1_Elecrtrodomestico1 {
	// Constantes
    private static final double RESOLUCION_DEFAULT = 20;
    private static final boolean SINTONIZADOR_TDT_DEFAULT = false;
    private static final double PORCENTAJE_INCREMENTO_RESOLUCION = 0.3;
    private static final double PRECIO_INCREMENTO_SINTONIZADOR_TDT = 50;
	private static final double PRECIO_BASE_DEFAULT = 0;
	private static final String COLOR_DEFAULT = null;
	private static final char CONSUMO_ENERGETICO_DEFAULT = 0;

    // Atributos
    private double resolucion;
    private boolean sintonizadorTDT;
	private double PESO_DEFAULT;

    // Constructores
    public T9_1_Television() {
    	this.preciobase=PRECIO_BASE_DEFAULT;
    	this.peso=PESO_DEFAULT;
    	this.color=COLOR_DEFAULT;
    	this.consumenergetico=CONSUMO_ENERGETICO_DEFAULT;
    	this.resolucion=RESOLUCION_DEFAULT;
    	this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
    }

    public T9_1_Television(double precioBase, double peso) {

    	this.preciobase=precioBase;
    	this.peso=peso;
    	this.color=COLOR_DEFAULT;
    	this.consumenergetico=CONSUMO_ENERGETICO_DEFAULT;
    	this.resolucion=RESOLUCION_DEFAULT;
    	this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
    	
    }

    public T9_1_Television(double resolucion, boolean sintonizadorTDT, double precioBase, double peso, String color, char consumoEnergetico) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Resolución y sintonizador TDT
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Precio Final
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= (1 + PORCENTAJE_INCREMENTO_RESOLUCION);
        }

        if (sintonizadorTDT) {
            precioFinal += PRECIO_INCREMENTO_SINTONIZADOR_TDT;
        }

        return precioFinal;
    }
}
