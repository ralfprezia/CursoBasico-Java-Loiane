package deal.Ralf.cursojava.exe013;

import java.util.Scanner;

public class SlarioPorHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas");
        double horas = scan.nextDouble();

        System.out.println("Entre com o valor/hora");
        double salario = valorHora * horas;

        System.out.println(") salário é de: R$ " + salario + "reais.");
    }

}
