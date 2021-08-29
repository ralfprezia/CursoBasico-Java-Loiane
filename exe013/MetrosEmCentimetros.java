package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class MetrosEmCentimetros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com as medidas em metros");
        double metros = scan.nextDouble();

        double cm = metros * 100;
        System.out.println(metros + " m é igual à " + cm + " cm");
    }
}
