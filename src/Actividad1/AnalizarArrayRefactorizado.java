package Actividad1;
/**
 * Programa que analiza un conjunto de números para:
 * 1. Sacar el número más grande.
 * 2. Comprobar si el número más grande se repite.
 * 3. Calcular la media del array.
 * 4. Mostrar por pantalla si esta aprobado o no.
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
        
        
        for (int i = 1; i < numeros.length; i++) { // Bucle que saca el número más alto
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) { // Bucle que indica si el número más alto se repite
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

        int sumaNums = 0;
        for (int i = 0; i < numeros.length; i++) { // Suma todos los números del array
            sumaNums += numeros[i];
        }

        double media = (double)(sumaNums/ numeros.length); // Saca la media del array.
        System.out.printf("La media de los número es: " +media);

        if (media >= 5) {
            System.out.println("BIEN, esta aprobado.");
        } else {
            System.out.println("MAL, esta suspendido.");
        }
    }
}

