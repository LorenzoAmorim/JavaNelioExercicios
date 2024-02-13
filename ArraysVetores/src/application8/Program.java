package ArraysVetores.src.application8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        double media = 0.0;
        int mediaPares = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            if(vect[i] %2 ==0){
                media += vect[i];
                mediaPares++;
            }
        }

        if (mediaPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            System.out.println("MEDIA DOS PARES = " + media/mediaPares);
        }

        sc.close();
    }
}
