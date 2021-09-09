import java.util.Scanner;

public class Fatoriais {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Inicio de fatorial: ");
        int numeroInicial = sc.nextInt();
        
        System.out.print("Inicio de fatorial: ");
        int numeroFinal = sc.nextInt();
        
        exibirFatoriais(numeroInicial, numeroFinal); 
        //System.out.println("Resultado da Fatorial: " +resultado); 

        sc.close();
    }
    
    public static void exibirFatoriais(int ni, int nf){
        
        for(int j = ni; j <= nf; j++){
            long f = 1; 
            System.out.print(j+"! => ");
            for(int i = 1; i <= j;i++){
                f *= i;
            }
            System.out.println("Resultado: "+f); 
        }
    }
}