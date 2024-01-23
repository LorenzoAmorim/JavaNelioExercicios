package IntrudocaoPOO.Poo1.application;

import IntrudocaoPOO.Poo1.entities.Rectangle;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");

        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());

        sc.close();
    }
}