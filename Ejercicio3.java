import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int filas, columnas;

        do { //lectura de las filas
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
            if (filas < 2) {
                System.out.println("Valor no válido");
            }
        } while (filas < 2);

        //se crea el array solo con el número de filas
        //el número de columnas se deja vacío 
        //el número de columnas para cada fila lo indicaremos después
        int[][] A = new int[filas][];

        //para cada fila pedimos el número de columnas que tendrá
        for (int i = 0; i < A.length; i++) {
            do {
                System.out.print("Número de columnas para la fila " + i + ": ");                                  
                columnas = sc.nextInt();
                if (columnas < 1) {
                    System.out.println("Valor no válido");
                }
            } while (columnas < 1);
            //Se crea un array del tamaño indicado y se le asigna a la fila
            A[i] = new int[columnas];
        }

        //A cada elemento de la matriz se le asigna un valor aleatorio del 1 al 5                                 
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
               A[i][j] = rnd.nextInt(5) + 1;
            }
        }

        //Se muestra el contenido de la matriz
        System.out.println("Contenido del array:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}