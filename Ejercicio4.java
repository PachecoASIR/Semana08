import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String p;
        String p2;
        String p3;

        Scanner leer_entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres: ");

        p = leer_entrada.nextLine();
    
                System.out.println (p);

        System.out.println("Introduce una nueva cadena de caracteres: ");

        p2 = leer_entrada.nextLine();      
                
                System.out.println (p2.length());
        
        System.out.println("Introduce una cadena de caracteres: ");

        p3 = leer_entrada.nextLine();
            
                System.out.println (p3);
        }
    }