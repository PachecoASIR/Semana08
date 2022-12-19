import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner( System.in );
		 
		int max = 20;
		int min = 1;
		
		
		int n1 = (int)Math.floor(Math.random()*(max-min+1)+min);

        /*Le damos al usuario los intentos necesarios para adivinar el número */
		 for(int i= 0;i<99 ;i++) {
			   
			 System.out.println( "Introduce un numero entre 1 y 20 si adivinas, ganas: " );
			  int n2 = sc.nextInt();
			  if(n1 == n2) {
				  System.out.println( "Ganaste!" );
				  return;
			  }else if(n1 < n2) {
				  System.out.println( "Error, el número es menor al tuyo." );
			  }else if(n1 > n2) {
				  System.out.println( "Error, el número es mayor al tuyo." );
			  }			 
		 }		
	}
}