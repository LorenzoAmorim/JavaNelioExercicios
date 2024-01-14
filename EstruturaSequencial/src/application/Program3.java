package EstruturaSequencial.src.application;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B,C,D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int DIFERENCA = (A*B-C*D);
        System.out.println("DIFERENÇA = " + DIFERENCA);

        sc.close();
    }
}
