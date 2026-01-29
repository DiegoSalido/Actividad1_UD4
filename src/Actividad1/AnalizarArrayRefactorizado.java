package Actividad1;
/**
 * Programa que analiza un conjunto de números.
 * 
 * Realiza las siguientes operaciones:
 * 1. Busca el número mayor del array.
 * 2. Comprueba si el número mayor se repite.
 * 3. Calcula la media de los números.
 * 4. Muestra por pantalla si está aprobado o no.
 */
public class AnalizarArrayRefactorizado {
	/** 
	 * Punto de entrada del programa.
	 * Aquí se ejecuta todo el programa
	 */

    public static void main(String[] args) {

        int[] numeros = {5, 7, 3, 7, 2, 9, 7};
        int contador = 0;
        int numMayor = numeros[0];
        
        // Bucle que saca el número más alto
        for (int i = 1; i < numeros.length; i++) { 
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }
        }
        
        // Bucle que indica si el número más alto se repite
        for (int i = 0; i < numeros.length; i++) { 
            if (numeros[i] == numMayor) {
                contador++;
            }
        }
        
        // Indica si el numero mayor se repite o no
        if (contador > 1) {
        	System.out.println("El número " +numMayor +" se repite " +contador +" veces.");
        } else {
        	System.out.println("El número " +numMayor +" no se repite.");
        }

        // Suma todos los números del array
        int sumaNums = 0;
        for (int i = 0; i < numeros.length; i++) { 
            sumaNums += numeros[i];
        }
        
        // Saca la media del array.
        double media = (double)sumaNums / numeros.length; 
        System.out.printf("La media de los número es: %.2f", media);
        System.out.println("");

        if (media >= 5) {
            System.out.println("BIEN, esta aprobado.");
        } else {
            System.out.println("MAL, esta suspendido.");
        }
    }
}

