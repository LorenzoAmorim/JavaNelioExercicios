package EstruturaRepetitiva2.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++ ){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = (a * 2.0 + b * 3.0 + c * 5.0)/10;

            // 'printf' para valores personalizados(formatados) ex: valor com 2 casas decimais
            System.out.printf("%.2f%n", media);
        }


        sc.close();
    }
}
