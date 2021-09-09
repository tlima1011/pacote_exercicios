import java.util.Scanner;

public class Exercicio8 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número: " ); 
        int x = sc.nextInt(); 

        do{
            if(x % 2 == 0){
                x = x / 2; 
            }else{
                x = 3 * x + 1; 
            }
            if(x != 1){
                System.out.print(x + " > "); 
            }
            if(x == 1){
                System.out.print(x); 
            }
        }while(x != 1);
        //System.out.print(1); 
        sc.close();
    }    
}
