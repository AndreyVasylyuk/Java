package ua.pp.andreyvasylyuk.javafain24.lesson6;

public class Contractor extends Person implements Payable{
    public Contractor(String name) {
        super(name);
    }
    
    public boolean increasePay(int percent) {
        System.out.println("Increase salary by " + percent + "%. "+ getName());
        return true;
    }
}
