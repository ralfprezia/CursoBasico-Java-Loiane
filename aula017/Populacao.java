package deal.Ralf.cursojava.aula017;

public class Populacao {
    public static void main(String[] args) {
        int popA = 8000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){

            popA += (popA/100) * 3;
            popB += (popA/100) * 1.5;
            cont++;
        }
        System.out.println("população A: " + popA);
        System.out.println("população B: " + popB);
        System.out.println("Qtd anos: " + cont);
    }
}
