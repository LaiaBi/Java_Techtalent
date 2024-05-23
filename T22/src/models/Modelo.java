package models;

public class Modelo {

private Double moneda;
private Double cantidad;
private Double resultado;

public static void setMoneda(Double moneda) {
	this.moneda=moneda;
}
public static void setCantidad(Double cantidad) {
	this.cantidad=cantidad;
}
public Double getResultado() {
	return resultado;
public void convertirDolarAEuro() {
	resultado = cantidad * moneda;
}
public void convertirEuroADolar() {
	resultado = cantidad * moneda;
}
}