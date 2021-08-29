package deal.Ralf.cursojava.aula33.SobreCarga;
public class TesteCalculadora {

    public static void main(String[] args) {

        MInhaCalculadora calc = new MInhaCalculadora();

        calc.soma(1, 2);
        calc.soma(1.0, 2.0);
    }
}
