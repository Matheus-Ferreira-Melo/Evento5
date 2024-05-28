import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;
        double saldo=0;
        double saldo2 = saldo;
        int cont =0;
        do{
            double presunto = 20.34;
            double frango = 52.50;
            double acai = 17.56;
            double peixe = 34.97;
            System.out.print("Produdos:\n" +
                    "[1] Presunto -> R$20,34\n" +
                    "[2] Frango assado -> R$52,50\n" +
                    "[3] Açai -> R$17,56\n" +
                    "[4] Peixe -> R$34,97\n" +
                    "[5] Sair\n" +
                    "Escolha uma opção: ");
            escolha = entrada.nextInt();

            if(escolha == 1){
                cont++;
                saldo+=presunto;
            }
            else if(escolha == 2){
                cont++;
                saldo+=frango;
            }
            else if(escolha ==3){
                cont++;
                saldo+=acai;
            }
            else if(escolha ==4){
                cont++;
                saldo+=peixe;
            }
            else if(escolha==5){

            }
            else{
                System.out.println("Opção inválida!!");
            }

            if(cont > 2 || saldo <100)
                saldo2 = saldo;
                saldo2 = saldo2-Metodos.calcularPercentualDesconto(cont);

        }while(escolha!=5);
        System.out.printf("Saldo: %.2f\n" +
                "Percentual de Desconto: %.1f\n" +
                "Valor com desconto: \n" +
                "Total a pagar: %.2f",saldo,Metodos.calcularPercentualDesconto(cont), saldo2,);

    }
}