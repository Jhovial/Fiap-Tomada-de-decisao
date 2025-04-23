import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double x,y,resultado;

        System.out.println("Me informe o Valor de X: ");
        x= sc.nextDouble();



        if (x> 5 || x< - 5){

            y= 8/Math.sqrt(Math.pow(x,2)-25);
            System.out.println("Sua conta ficará: "+y);

        }
        else {

            y= 8/Math.sqrt(Math.pow(x,2)-25);
            System.out.println("Sua conta não faz sentido, Seu x não tem raiz!!!"+y);

        }

        if (x< - 5 && x < 5){

            System.out.println("Seu x esta errado");

        }
        else {
            y= 8/Math.sqrt(Math.pow(x,2)-25);

        }


    }
}
