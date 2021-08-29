package deal.Ralf.cursojava.aula017;

import java.util.Scanner;

public class ValidaNome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean infoValida = true;
        String nome;
        int idade;

        do{
            System.out.println("Entre com um nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            }else{
                System.out.println("Nome precisa de no mínimo 3 caracteres");
            }
        }while (!infoValida);

        infoValida = false;
    }
}
