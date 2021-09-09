class Multiplo{

    public static void main(String [] args){

        int [] multiplos = new int[101];

        for(int i = 0; i <= 100;i++){
            if(i % 3 == 0) {
                System.out.println(i); 
                multiplos[i] = i;
            }
        }
        for(int i = 0; i <= 100;i++){
            System.out.println("Na posicao " + i + " Valor: " + multiplos[i]);
        }

    }
}