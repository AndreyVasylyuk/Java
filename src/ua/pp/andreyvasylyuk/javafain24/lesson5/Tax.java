package ua.pp.andreyvasylyuk.javafain24.lesson5;

public class Tax {
    public void calcTax(String[] args) {
        if(args.length != 3) {
            System.out.println("Sample usage of the progra:" +
                            " java TestTax 5000 NJ 2");
            System.exit(0);
        }
    }
}
