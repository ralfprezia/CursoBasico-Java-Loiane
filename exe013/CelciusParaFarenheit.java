package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class CelciusParaFarenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celcius");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;
        System.out.println("A temperatura" + c + " em celcius equivale à" + f + "em farenheit.");
    }
}
