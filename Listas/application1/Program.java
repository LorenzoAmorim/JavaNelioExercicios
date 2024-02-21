package Listas.application1;

import Listas.application1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//********************************************
//                 REVISAR!!
//********************************************
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> lista = new ArrayList<>();
        System.out.print("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d:\n", i + 1);

            System.out.print("Id:");
            int id = sc.nextInt();
            while (hasId(lista, id)) {
                System.out.print("Id already taken. Try again:");
                id = sc.nextInt();
            }

            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary:");
            double salary = sc.nextDouble();

            lista.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase :");
        int idSalary = sc.nextInt();
        Employee emp = lista.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println("List of employees:");
        for (Employee obj : lista) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
