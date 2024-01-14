package EstruturaSequencial.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int p1,p2,n1,n2;
        double vu1,vu2;

        p1 = sc.nextInt();
        n1 = sc.nextInt();
        vu1 = sc.nextDouble();
        p2 = sc.nextInt();
        n2 = sc.nextInt();
        vu2 = sc.nextDouble();

        double total = (vu1 * n1) + (vu2 * n2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total );

        sc.close();
    }
}
