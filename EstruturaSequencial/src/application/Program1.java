package EstruturaSequencial.src.application;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,soma;
        a = sc.nextInt();
        b = sc.nextInt();
        soma = a+b;
        System.out.println("soma = " + soma);

        int c, d, soma1;
        c = sc.nextInt();
        d = sc.nextInt();
        soma1 = c + d;
        System.out.println("SOMA = " + soma1);




        sc.close();
    }
}
