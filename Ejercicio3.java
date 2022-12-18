import java.util.Scanner;

public class Ejercicio3 {

	public static int[] array (int n,int max,int min) {
		
		   int [] array2 = new int[n];
		   for(int i= 0;i<array2.length ;i++) {
			   
			   array2[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
			   
		   }
		   return array2;
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		  System.out.println( "Introduzca la cantidad de elementos que desea que contenga el array: " );
		  int n1 = sc.nextInt();
		  System.out.println( "Introduzca un número como maximo: " );
		  int n2 = sc.nextInt();
		  System.out.println( "Introduzca un número como minimo: " );
		  int n3 = sc.nextInt();
		  int [] resultado = array(n1,n2,n3);

		  for(int i= 0;i<resultado.length ;i++) {

			  System.out.println(resultado[i]);
              
		}
	}
}
