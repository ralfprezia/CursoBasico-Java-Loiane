package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Entre com outro número interio");
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real");
        double num3 =  scan.nextInt();

        int res1 = (num1 * 2) * (num2 /2);
        double res2 = (num1 * 3) + num3;
        double res3 = Math.pow (num3, 3);

        System.out.println("Resultado 1: " + res1);
        System.out.println("Resultado 2: " + res2);
        System.out.println("Resultado 3: " + res3);


    }
}
