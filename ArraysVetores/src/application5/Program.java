package ArraysVetores.src.application5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementor vai ter o vetor? ");
        int n = sc.nextInt();
        int vect[] = new int[n];
        double calculo = 0;
        int pares = 0;

        for (int i = 0; i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++ ){
            if(vect[i] %2 == 0){
                pares ++;
                calculo += vect[i];
            }
        }
        
        double media = calculo/pares;
        System.out.println("MEDIA DOS PARES = " + media);


        sc.close();
    }
}
