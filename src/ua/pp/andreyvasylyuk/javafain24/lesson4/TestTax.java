package ua.pp.andreyvasylyuk.javafain24.lesson4;

public class TestTax {
    public static void main(String[] args) {
        double grossIncome = 50000;
        String state = "NJ";
        int dependents = 2;
        
        Tax t = new Tax(grossIncome, state, dependents);
        double yourTax = t.calcTax();
        
        Tax t2 = new Tax(65000,"TX",4);
        double hisTax = t2.calcTax();
        
        Tax.convertToEuros(yourTax);
        Tax.convertToEuros(hisTax);

    }

}