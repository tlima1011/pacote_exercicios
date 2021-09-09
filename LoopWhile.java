class LoopWhile{ 

    public static void main(String [] args){

        /*Faça o laço enquanto esse valor não alcance 300. 
        Dentro do laço não esqueça de imprimir o número e alterá-lo!*/
        int i = 0, soma = 0; 
        while (i < 300){
            System.out.print(i + " ");
            i++; 
        }
        for(i = 0; i <= 1000;i++){
            System.out.println(i);
            soma += i; 
        }
        System.out.println("Soma de dados: " +soma); 
    }

}