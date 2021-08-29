package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class FarenheitParaCelcius {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Faenheit");
        double f = scan.nextDouble();

        double c = (5 * (f - 32) /9);
        System.out.println("A temperatura" + f + " em farenheit equivale à" + c + "em Celcius.");
    }
}
