import javax.swing.JOptionPane;

public class CalculadoraInversa {

    public static void main(String[] args) {
        // Solicitar operandos y operador al usuario
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer operando (entero): "));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo operando (entero): "));
        String operador = JOptionPane.showInputDialog("Ingrese el signo aritmético (+, -, *, /): ");

        // Realizar la operación según el operador ingresado
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
                    System.exit(0);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Operador no válido.");
                System.exit(0);
        }

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
    }
}