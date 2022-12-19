import java.util.Scanner;

public class Ejercicio6 {
	
	public static void juego () {
		
		 Scanner sc = new Scanner( System.in );
		 
		int max = 100;
		int min = 1;
		
		
		int n1 = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		 for(int i= 1;i<6 ;i++) {
			   
			 System.out.println( "Intenta adivinar el numero, tienes 5 intentos: " );
			  int n2 = sc.nextInt();
			  if(n1 == n2) {
				  System.out.println( "Ganaste!" );
				  return;
			  }else if(n1 > n2) {
				  System.out.println( "Error, el número es menor al tuyo." );
				  System.out.println( "Te quedan " + (5-i) + " intentos." );
			  }else if(n1 < n2) {
				  System.out.println( "Error, el número es mayor al tuyo." );
				  System.out.println( "Te quedan " + (5-i) + " intentos." );
			  }
			 
		 }
		
	}
	
/*Llamamos al método estático juego como nos solicita el ejercicio */
	public static void main(String[] args) {
		juego();
	}

}