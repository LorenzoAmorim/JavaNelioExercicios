package EstruturaSequencial.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, area, pi = 3.14159;

        System.out.println();
        r = sc.nextDouble();

        area = pi*(r*r);
        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
