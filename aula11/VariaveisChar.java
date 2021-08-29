package deal.Ralf.cursojava.aula11;

public class VariaveisChar {
    public static void main(String[] args) {
        char o = 'o';
        char i = 'i';
        System.out.println("" + o + i);// vai printar oi no console
        char a = 111;
        char b = 105;
        System.out.println(o + i);// vai printar 216 no console
        char aComCrase = 0x00E1;
        System.out.println("Printa o a craseado, do unicode " + aComCrase);

    }
}
