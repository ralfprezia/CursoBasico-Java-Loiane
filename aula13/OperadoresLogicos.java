package deal.Ralf.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        boolean res1 = (a == 1) && (b == 2);
        System.out.println("Valor de a é 1 AND o valor de b é 2" + res1);

        boolean res2 = (a == 1) || (b == 2);
        System.out.println("Valor de a é 1 AND o valor de b é 2" + res2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

        int res = 1 + 1 - 1 + 1 * 1 /1;
        System.out.println(res);

    }
}
