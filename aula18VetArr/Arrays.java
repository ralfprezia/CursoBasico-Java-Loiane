package deal.Ralf.cursojava.aula18VetArr;

public class Arrays {
    public static void main(String[] args) {
       double[] temperaturas = new double[365];//365 posições dentro do array
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        System.out.println("Temperatura do dia 1" + temperaturas[0]);
        System.out.println("Temperatura do dia 3" + temperaturas[2]);

        System.out.println("O tamanho do array" + temperaturas.length);
        System.out.println("Valores do array");

        for(int i=0; i<temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }


    }
}
