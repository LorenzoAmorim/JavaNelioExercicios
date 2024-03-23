package ClassesEMetodosAbstratos.src.application.entities;

public class PF {
    private String name;
    private double annualRevenue;
    private double healthSpend;

    public PF(){
    }

    public PF(String name, double annualRevenue, double healthSpend) {
        this.name = name;
        this.annualRevenue = annualRevenue;
        this.healthSpend = healthSpend;
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

    public double getHealthSpend() {
        return healthSpend;
    }

    public void setHealthSpend(Double healthSpend) {
        this.healthSpend = healthSpend;
    }

//    public double Tax(){
//        double fee = 0;
//        if(annualRevenue <= 20000.00){
//            fee = annualRevenue * 0.15;
//
//        }else if (annualRevenue > 20000.00){
//            fee = annualRevenue * 0.25;
//
//        } else if (healthSpend != 0) {
//            fee = healthSpend * 0.50;
//
//        }
//        return fee;
//    }

    public double Tax() {
        double taxRate;
        if (annualRevenue < 20000.00) {
            taxRate = 0.15;
        } else {
            taxRate = 0.25;
        }

        double taxAmount = annualRevenue * taxRate;

        if (healthSpend != 0) {
            taxAmount -= healthSpend * 0.50;
        }

        return taxAmount;
    }

    public String toString() {
        return name + ": $" + Tax();
    }
}
