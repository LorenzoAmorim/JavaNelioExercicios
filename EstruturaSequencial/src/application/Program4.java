package EstruturaSequencial.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employee,worked;
        double valuePerHour, salary;

        employee = sc.nextInt();
        worked = sc.nextInt();
        valuePerHour = sc.nextDouble();

        salary = (worked * valuePerHour);

        System.out.println("NUMBER = " + employee);
        System.out.println("SALARY = $" + salary);

        sc.close();
    }
}
