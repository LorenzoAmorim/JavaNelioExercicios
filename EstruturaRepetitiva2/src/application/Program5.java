package EstruturaRepetitiva2.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;
        for(int i = 1; i<=n; i++){
         fatorial *= i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}
