package ArraysVetores.src.application3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        int n = sc.nextInt();
        int vect[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int npares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i<n; i++){
            if(vect[i] %2 == 0) {
                System.out.print(" " + vect[i]);
                npares ++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + npares);

        sc.close();
    }
}
