package ArraysVetores.src.application4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double vect[] = new double[n];
        double maiorValor = vect[0];
        int posicaoMaior = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 1; i<n; i++){
            if(vect[i]> maiorValor){
                maiorValor = vect[i];
                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);




        sc.close();
    }
}
