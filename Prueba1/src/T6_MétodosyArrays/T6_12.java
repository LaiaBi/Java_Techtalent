package T6_MétodosyArrays;

public class T6_12 {
	function filtrarDigitos(arr, numero) {
	    let nuevoArray = arr.filter(x => x.toString().endsWith(numero.toString()));
	    return nuevoArray;
	}

	// Ejemplo de uso
	let tamanio = 10;
	let miArray = [123, 456, 789, 321, 654, 987, 111, 222, 333, 444];
	let numeroIndicado = 4;

	let resultado = filtrarDigitos(miArray, numeroIndicado);
	console.log(resultado);

}
