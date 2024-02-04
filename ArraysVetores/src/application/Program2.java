package ArraysVetores.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;
        double average = 0.0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for(int i = 0; i<n; i++){
            System.out.print(" " + vect[i]);
        }

        System.out.print("\nSOMA = ");
        for (int i = 0; i<n; i++){
            sum += vect[i];

        }
        System.out.print(sum);

        System.out.print("\nMEDIA = ");
        average = sum/n;
        System.out.println(average);

        sc.close();
    }
}
