package deal.Ralf.cursojava.aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int res = 1 + 2;
        System.out.println(res);

        res = res -1;
        System.out.println(res);

        res = res * 2;
        System.out.println(res);

        res = res / 2;
        System.out.println(res);

        res = res + 8;
        System.out.println(res);

        res = res % 7;
        System.out.println(res);

        res++;
        System.out.println(res);

        System.out.println(res++);//imprime o resultado e depois adiciono 1 no valor
        System.out.println(++res);//faz a soma e depois imprimir o resultado


        String primeiroNome = "Esta é ";
        String segundoNome = "uma string concatenada";
        System.out.println(primeiroNome + segundoNome);




    }
}
