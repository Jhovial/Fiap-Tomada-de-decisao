import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double L1, L2, L3, triangulo;

        System.out.println("Diga para mim o primeiro lado: ");
        L1= sc.nextDouble();
        System.out.println("Diga para mim o segundo lado: ");
        L2= sc.nextDouble();
        System.out.println("Diga para mim o terceiro lado: ");
        L3= sc.nextDouble();

        if ( (L3< L1+L2) && (L1< L2 +L3)  && (L2< L1+L3) ){

            System.out.println("É um triangulo");

        }
        else {
            System.out.println("Não é um triangulo");
        }

    }
}
