package EstruturaRepetitiva2.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double divisao = a/b;
            if (b == 0) {
                System.out.println("divisão impossível");
            }else {
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
