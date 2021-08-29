package deal.Ralf.cursojava.aula017;

public class LoopsFor {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++){
            System.out.println("i tem valor " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("I tem valor " + i + "\nJ tem valor " + j);
        }

        /*
        //loop infinito// não executar!
        //for (;; );
        */
    }

}
