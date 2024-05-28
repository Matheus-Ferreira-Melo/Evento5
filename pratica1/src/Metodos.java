public class Metodos {
    public static double calcularPercentualDesconto(int cont){
        double desc;
        if(cont ==3){
            desc = 5/100;

        }
        else if(cont ==4){
            desc =10/100;

        }
        else{
            desc = 15/10;

        }
        return desc ;
    }
}
