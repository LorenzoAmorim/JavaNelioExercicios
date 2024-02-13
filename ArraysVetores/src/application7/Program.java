package ArraysVetores.src.application7;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double media = 0.0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i<n; i++){
            media += vect[i];
//            media = media/n;
        }
        media = media/n;
        System.out.println("MEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i<n; i++){
            if (vect[i]< media){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
