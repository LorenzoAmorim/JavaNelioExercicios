package EstruturaSequencial.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado,retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A*C)/2;
        circulo = 3.14159 * (C*C);
        trapezio = (A + B)/2 * C;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("TRIÂNGULO: %.2f%n", triangulo);
        System.out.printf("CÍRCULO: %.2f%n", circulo);
        System.out.printf("TRAPÉZIO: %.2f%n", trapezio);
        System.out.printf("QUADRADO: %.2f%n", quadrado);
        System.out.printf("RETÂNGULO: %.2f%n", retangulo);

        sc.close();
    }
}
