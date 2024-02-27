package T6_MétodosyArrays;

public class T6_10 {

	public static void main(String[] args) {
		import random

		def es_primo(numero):
		    if numero < 2:
		        return False
		    for i in range(2, int(numero**0.5) + 1):
		        if numero % i == 0:
		            return False
		    return True

		def generar_primos(tamano):
		    primos = [random.choice([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]) for _ in range(tamano)]
		    return primos

		if __name__ == "__main__":
		    try:
		        tamano_array = int(input("Ingrese el tamaño del array de números primos: "))
		        numeros_primos = generar_primos(tamano_array)

		        print(f"\nNúmeros primos generados: {numeros_primos}")

		        mayor_primo = max(numeros_primos)
		        print(f"\nEl número primo más grande es: {mayor_primo}")

		    except ValueError:
		        print("Por favor, ingrese un valor válido para el tamaño del array.")
