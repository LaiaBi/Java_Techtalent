package T6_MétodosyArrays;

public class T6_10 {

	public static void main(String[] args) {
		import random

		def es_primo(numero):
		    if numero < 2:
		        return False
		    for i in range(2, int(numero**0.5) + 1);
		        if numero % i == 0;
		            return False
		    return True
		    		def generar_primos(tamano):
		    		    primos = []
		    		    while len(primos) < tamano:
		    		        numero = random.randint(1, 100)
		    		        if es_primo(numero) and numero not in primos:
		    		            primos.append(numero)
		    return primos

		    		def encontrar_mayor(array):
		    		    return max(array)

		    		if __name__ == "__main__":
		    		    try:
		    		        tamano_array = int(input("Ingrese el tamaño del array de números primos: "))
		    		        numeros_primos = generar_primos(tamano_array)

		    		        print(f"\nNúmeros primos generados: {numeros_primos}")

		    		        mayor_primo = encontrar_mayor(numeros_primos)
		    		        print(f"\nEl número primo más grande es: {mayor_primo}")

		    		    except ValueError:
		    		        print("Por favor, ingrese un valor válido para el tamaño del array.")
	}
}
