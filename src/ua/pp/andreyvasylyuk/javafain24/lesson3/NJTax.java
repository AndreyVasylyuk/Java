package ua.pp.andreyvasylyuk.javafain24.lesson3;

public class NJTax extends Tax{
    
    public double calcTax() {
        double stateTax = 0;
        if(grossIncome < 30_000) {
            stateTax = grossIncome*0.05;
        } else {
            stateTax = grossIncome*0.06;
        }
        return adjustForStudents(stateTax);
    }
    
    double adjustForStudents(double stateTax) {
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }
}
