import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double Prova1,Prova2,Trabalho1,Trabalho2,Trabalho3, mediaProva, MediaTrabalho,mediaFinal;

        System.out.println("Nota da 1a prova: " );
        Prova1 = sc.nextDouble();

        System.out.println("Nota da 2a prova: " );
        Prova2 = sc.nextDouble();

        System.out.println("Nota da 1a Trabalho: " );
        Trabalho1 = sc.nextDouble();

        System.out.println("Nota da 2a Trabalho: " );
        Trabalho2 = sc.nextDouble();

        System.out.println("Nota da 3a Trabalho: " );
        Trabalho3 = sc.nextDouble();

        mediaProva = (Prova1+Prova2)/2;
        mediaFinal= (Trabalho1+Trabalho2+Trabalho3)/3;

        mediaFinal = mediaProva * 0.7 +mediaProva * 0.3;

        if (mediaFinal >= 6){
            System.out.println("APROVADO! :) ");
        }
        else {
            System.out.println("Como você conversava está REPROVADO :(");
        }

    }
}
