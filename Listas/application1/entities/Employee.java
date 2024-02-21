package Listas.application1.entities;

public class Employee {
    private Integer id;
    private String name;
    private double Salary;

    public Employee() {
    }

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void increaseSalary(double percentage){
        Salary += Salary * percentage/100.00;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", getSalary());
    }
}
