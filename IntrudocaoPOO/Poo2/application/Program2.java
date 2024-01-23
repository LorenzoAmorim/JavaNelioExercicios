package IntrudocaoPOO.Poo2.application;
import IntrudocaoPOO.Poo2.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.GrossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println(emp.toString());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println("Update data: " + emp.toString());

        sc.close();
    }
}
