package ArraysVetores.src.application11;
import ArraysVetores.src.application11.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantoas pessoas serão digitadas?");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];


        for(int i = 0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);

            pessoas[i] = new Pessoa(altura,genero);
        }

        double menor = pessoas[0].getAltura();
        int posicaoMenor = 0;

        for(int i = 0;i<n; i++){
            if(pessoas[i].getAltura()<menor){
                menor = pessoas[i].getAltura();
                posicaoMenor = i;
            }
        }
        System.out.println("Menor altura = " + pessoas[posicaoMenor].getAltura());

        double maior = pessoas[0].getAltura();
        int posicaoMaior = 0;
        for(int i = 0; i<n; i++){
            if (pessoas[i].getAltura() > maior) {
                maior = pessoas[i].getAltura();
                posicaoMaior = i;
            }
        }
        System.out.println("Maior altura = " + pessoas[posicaoMaior].getAltura());

        double media = 0.0;
        int posicaoMulher = 0;
        for(int i = 0; i<n; i++){
            if(pessoas[i].getGenero() == 'f'){
                posicaoMulher ++;
                media += pessoas[i].getAltura();

            }
        }
        System.out.printf("Media das alturas das mulheres = %.2f" + media/posicaoMulher);

        int numeroHomens = 0;
        for (int i = 0; i<n; i++){
            if(pessoas[i].getGenero() == 'm'){
                numeroHomens ++;
            }
        }
        System.out.println("Numero de homens = " + numeroHomens);

        sc.close();
    }
}
