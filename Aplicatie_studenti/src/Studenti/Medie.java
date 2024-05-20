package Studenti;
import java.util.Map;
public class Medie {
    //calculareMedie()
	 public static double calculareMedie(Map<Materie, Integer> situatie) {
	        if (situatie.isEmpty()) {
	            return 0.0;
	        }
	        double suma = 0;
	        for (int nota : situatie.values()) {
	            suma += nota;
	        }
	        return suma / situatie.size();
	    }
}
