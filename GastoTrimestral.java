class GastoTrimestral{

    public static void main(String[] args) {
        
        double gastosJaneiro = 15000; 
        double gastosFevereiro = 23000;
        double gastosMarco = 17000; 

        double somaGastos = somarGastos(gastosJaneiro, gastosFevereiro, gastosMarco); 
        System.out.println("Soma dos gastos: " +String.format("%.2f", somaGastos));
        double media = somaGastos / 3;
        System.out.println("Media: " +String.format("%.2f", media));

    }

    public static double somarGastos(double gastosJaneiro, double gastosFevereiro, double gastosMarco){
        return gastosJaneiro + gastosFevereiro + gastosMarco; 
    }
}