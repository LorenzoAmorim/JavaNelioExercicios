package IntrudocaoPOO.Poo3.application;

import IntrudocaoPOO.Poo3.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();
        students.name = sc.nextLine();
        students.primeiro = sc.nextDouble();
        students.segundo = sc.nextDouble();
        students.terceiro = sc.nextDouble();

        System.out.println(students.toString());
        if(students.finalGrade() > 60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.println("MISSING "+ students.approvedOrMissing() + " POINTS");
        }

        sc.close();
    }
}
