package deal.Ralf.cursojava.aula20Matrizes;

public class Matrizes {
    public static void main(String[] args) {
        double [][] notasAlunos = new double[30][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 7.5;
        notasAlunos[1][2] = 0.9;
        notasAlunos[1][3] = 10;

        notasAlunos[2][0] = 7;
        notasAlunos[2][1] = 5;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 6;

        notasAlunos[3][0] = 9.6;
        notasAlunos[3][1] = 9.9;
        notasAlunos[3][2] = 10;
        notasAlunos[3][3] = 10;

        System.out.println(notasAlunos[3]);

    }
}
