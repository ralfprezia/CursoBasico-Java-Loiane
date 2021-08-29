package deal.Ralf.cursojava.aula14;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        int diaSemana = scan.nextInt();

        switch (diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 1:
                System.out.println("Fim de semana"); break;
            default:
                System.out.println("Não é um dia válido");
        }
    }
}
