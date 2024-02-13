package ArraysVetores.src.application9;

import ArraysVetores.src.application9.entities.Pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoas[] pessoa = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoa[i] = new Pessoas(nome, idade);

        }

        int maioridade = pessoa[0].getIdade();
        int posicaoMaior = 0;

        for(int i = 1; i<n; i++){
            if(pessoa[i].getIdade()> maioridade){
                maioridade = pessoa[i].getIdade();
                posicaoMaior = i;
            }
        }

        System.out.println(pessoa[posicaoMaior].getName());


        sc.close();
    }
}