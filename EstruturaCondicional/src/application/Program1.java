package EstruturaCondicional.src.application;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if(a < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }


        sc.close();
    }
}
