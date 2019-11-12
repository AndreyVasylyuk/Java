package ua.pp.andreyvasylyuk.javafain24.lesson3;

public class Tax {
    double grossIncome;
    String state;
    int dependents;
    
    public double calcTax() {
        double stateTax = 0;
        if(grossIncome < 30_000) {
            stateTax = grossIncome*0.05;
        } else {
            stateTax = grossIncome*0.06;
        }
        return stateTax;
    }
}
