import java.util.Scanner;

public class Fatorial {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Valor de fatorial: ");
        int numero = sc.nextInt(); 
        
        long resultado = calcularFatorial(numero); 
        System.out.println("Resultado da Fatorial: " +resultado); 

        sc.close();
    }
    
    public static long calcularFatorial(int numero){
        int f = 1; 
        for(int i = 1; i <= numero;i++){
            f *= i;
        }
        return f; 
    }
}
