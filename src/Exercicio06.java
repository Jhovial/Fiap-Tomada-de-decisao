import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a,b , c, temp;

        System.out.println("Informe o primeiro valor--> ");
        a= sc.nextInt();
        System.out.println("Informe o segundo valor--> ");
        b= sc.nextInt();
        System.out.println("Informe o terceiro valor--> ");
        c= sc.nextInt();

        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c){

            temp = b;
            b = c;
            c = temp;

        }

        System.out.println(a+" "+b+" "+c);

    }
}
