package IntrudocaoPOO.Poo2.entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage/100;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", $" + NetSalary();
    }
}
