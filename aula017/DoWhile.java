package deal.Ralf.cursojava.aula017;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do{
            System.out.println("Entre com o nome do usuário");
            nomeUser=  scan.next();

            System.out.println("Entre com a senha");
            senha=  scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                System.out.println("Senha igual a usuário.");
            }
            else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos.");
            }
        } while (!infoValidas);
    }
}
