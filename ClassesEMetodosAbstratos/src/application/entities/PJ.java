package ClassesEMetodosAbstratos.src.application.entities;

public class PJ extends PF {
    private String name;
    private double annualRevenue;
    private int employeeNumber;

    public PJ(){
    }

    public PJ(String name, double annualRevenue, int employeeNumber) {
        this.name = name;
        this.annualRevenue = annualRevenue;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double Tax(){
        double taxRate;
        if(employeeNumber > 10){
            taxRate = 0.14;
        }else
            taxRate = 0.16;

        double taxAmount = annualRevenue * taxRate;

        return taxAmount;
    }

    @Override
    public String toString(){
        return name + ": $" + Tax();
    }
}
