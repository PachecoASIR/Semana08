import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int numeros;

        numeros = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de elementos que desea en el array"));

        int [] array = new int[numeros];

        for(int i= 0;i<array.length ;i++) {
             System.out.printf( "Introduzca números hasta llegar al número de elementos seleccionado: " );
               array[i] = sc.nextInt();

        }
        array2(array);
    }
    public static void array2 (int array[]) {

        for(int i= 0;i<array.length ;i++) {
            System.out.println( i+1 + " " + array[i] );
       }
    }
}