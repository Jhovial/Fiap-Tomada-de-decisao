import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double compra, desconto1, ValorPagar, ValorTotal;

        System.out.println("Me informe o valor da sua compra e vamos ver seu desconto: ");
        compra= sc.nextDouble();

        if (compra> 1000){

            desconto1= compra *0.85;

            System.out.println("Seu desconto é de: "+desconto1);

            ValorTotal= compra-desconto1;
            System.out.println("Vc vai pagar: R$"+ValorTotal);


        }
        else {
            desconto1= compra *0.92;

            System.out.println("Seu desconto é de: "+desconto1);

            ValorTotal= compra-desconto1;
            System.out.println("Vc vai pagar: R$"+ValorTotal);


        }


    }
}
