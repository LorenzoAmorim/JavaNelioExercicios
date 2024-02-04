package ArraysVetores.src.application2;

import ArraysVetores.src.application2.entities.Pessoas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];
        double media = 0.0;
        double menor = 0.0;
        // fazer um array vazio dos nomes dos menores de 16
        ArrayList<String> menoresDe16 = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoas(nome, idade, altura);
            media += altura/n;

            if(idade < 16){
                menor ++;
                // adicionar os nomes dos menores de 16 no array vazio
                menoresDe16.add(nome);
            }
        }
        System.out.println();
        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (menor/n) * 100.0);

        // fazer um foreach para percorrer e após, chamar os nomes dos menores de 16
        for (String nomes :menoresDe16) {
            System.out.println(nomes);
        }

        sc.close();
    }
}
