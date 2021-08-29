package deal.Ralf.cursojava.aula017;

import java.util.Scanner;

public class BreakFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i=num; i <max; i++){//vai buscar os divisiveis por 7 que resultamn em 0 dentro de um limite
            if(i % 7 ==0 ){
                System.out.println(i);
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}
