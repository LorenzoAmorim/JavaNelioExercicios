package ArraysVetores.src.application10;

import ArraysVetores.src.application10.entities.Alunos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        System.out.print("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        Alunos[] alunos = new Alunos[n];
        double media;

        for(int i = 0; i<n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            double primeiraNota = sc.nextDouble();
            double segundaNota = sc.nextDouble();

            alunos[i] = new Alunos(nome, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i<n; i++){
            media = alunos[i].media();
            if(media >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }


        sc.close();
    }
}
