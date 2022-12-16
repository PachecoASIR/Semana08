import java.util.Scanner;

public class Ejercicio2 {

	public static int rand(int min , int max) {
		return (int)Math.floor(Math.random()*(max-min+1)+min);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		  System.out.println( "Esto es un generador de números random, a continuacción se le pedirá el rango en el que desee que busque el número." );
		  System.out.println( "Introduce un número para el mínimo: " );
		  int n1 = sc.nextInt();
		  System.out.println( "Introduce un número para el maximo: " );
		  int n2 = sc.nextInt();	
		  System.out.println(rand(n1,n2));
    }
}
