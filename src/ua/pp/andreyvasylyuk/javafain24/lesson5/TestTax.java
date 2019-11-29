package ua.pp.andreyvasylyuk.javafain24.lesson5;

public class TestTax {
    public static void main(String[] args) {
        double grossIncome = Double.parseDouble(args[0]);
        String state = args[1];
        int dependents = Integer.parseInt(args[2]);

        Tax t = new Tax();
        t.calcTax(args);
    }

}