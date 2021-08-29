package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class DobroAreaQuadrado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com as medidas do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println(" A área do quadrado é: " + area);

        System.out.println("O quadrado da área do quadrado é: " + area * 2);

    }
}
