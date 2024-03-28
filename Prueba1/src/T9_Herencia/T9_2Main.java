package T9_Herencia;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
public class T9_2Main {
	private static final T9Ej2Entregable[] series = null;
	private static final String Serial = null;
	public static void main
	{
	T9_2Serie ArrayS[]= new T9_2Serie [5];
	T9_2Videojuego ArrayV[]= new T9_2Videojuego [5];
	
	//Objetos Serie y Videojuegos
	T9_2Videojuego Videojuego1 = new T9_2Videojuego("Grand Theft Auto V", 90,"Acción y aventura de mundo abierto","Rockstar Games");
	T9_2Videojuego Videojuego2 = new T9_2Videojuego("Dark Souls III", 130," RPG de acción y aventura","FromSoftware");
	T9_2Videojuego Videojuego3 = new T9_2Videojuego("Fornite", 140,"Battle Royale, supervivencia","Epic games");
	T9_2Videojuego Videojuego4 = new T9_2Videojuego("Super Mario Odyssey", 12,"Plataforma de aventura","Nintendo");
	T9_2Videojuego Videojuego5 = new T9_2Videojuego("Los Sims 4", 230,"Simulación de vida","Maxis (desarrollado por Electronic Arts)");
	
	T9_2Serie Serie1 = new T9_2Serie("ALF", 4,"Comedia, ciencia ficción","Paul Fusco,Tom Patchett");
	T9_2Serie Serie2 = new T9_2Serie("Dr. Who",40,"Ciencia ficción, aventura, drama","Sydney Newman, C. E. Webber, Donald Wilson");
	T9_2Serie Serie3 = new T9_2Serie("House", 8,"Drama médico","David Shore");
	T9_2Serie Serie4 = new T9_2Serie("Sakura Card Captor", 3,"Magia, aventura, romance","CLAMP");
	T9_2Serie Serie5 = new T9_2Serie("CSI: Las Vegas", 15,"Drama policial, crimen, misterio, procedimental","Anthony E. Zuiker");
	
	//Insercción de cada objeto en su Array
		ArrayS[0] = Serie1; 
		ArrayS[1] = Serie2; 
		ArrayS[2] = Serie3;
		ArrayS[3] = Serie4;
		ArrayS[4] = Serie5;
		
		ArrayV[0] = Videojuego1;
		ArrayV[1] = Videojuego2;
		ArrayV[2] = Videojuego3;
		ArrayV[3] = Videojuego4;
		ArrayV[4] = Videojuego5;
		
	// Uso del método entregar
		Serie1.entregar(); 
		Serie3.entregar(); 
		Serie4.entregar(); 
		Videojuego2.entregar(); 
		Videojuego4.entregar(); 
		Videojuego5.entregar(); 
		
		// Contar cuántos Series y Videojuegos hay
        int seriesEntregadas = contarEntregados(series);
        T9_2Serie[] seriesDevueltas = contarEntregados(Serial);
        
        System.out.println("Series entregadas: " + seriesEntregadas);

        int videojuegosEntregados = contarEntregados(videojuegos);
//        T9Ej2Videojuego[] videojuegosDevueltos = devolverEntregados(videojuegos);
        
        System.out.println("Videojuegos entregadas: " + videojuegosEntregados);


        // Indicar el Videojuego con más horas estimadas
        T9Ej2Videojuego videojuegoMasHoras = obtenerVideojuegoMasHoras(videojuegos);
        // Indicar la Serie con más temporadas
        T9Ej2Serie serieMasTemporadas = obtenerSerieMasTemporadas(series);
        
     // Mostrar resultados
       
        System.out.println("\nEl videojuego con más horas estimadas es: \n" + videojuegoMasHoras);
        System.out.println("\nLa serie con más temporadas es: \n" + serieMasTemporadas);

	}
	
	// Método para contar objetos entregados
    public static int contarEntregados(T9Ej2Entregable[] entregables) {
        int count = 0;
        for (T9Ej2Entregable entregable : entregables) {
            if (entregable.isEntregado()) {
                count++;
            }
        }
        return count;
    }

    

    // Método para obtener el videojuego con más horas estimadas
    public static T9Ej2Videojuego obtenerVideojuegoMasHoras(T9Ej2Videojuego[] videojuegos) {
    	T9Ej2Videojuego masHoras = videojuegos[0];
        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].getHorasEstimadas() > masHoras.getHorasEstimadas()) {
                masHoras = videojuegos[i];
            }
        }
        return masHoras;
    }

    // Método para obtener la serie con más temporadas
    public static T9Ej2Serie obtenerSerieMasTemporadas(T9Ej2Serie[] series) {
    	T9Ej2Serie masTemporadas = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i].getNumeroTemporadas() > masTemporadas.getNumeroTemporadas()) {
                masTemporadas = series[i];
            }
        }
        return masTemporadas;
    }