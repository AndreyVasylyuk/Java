package ua.pp.andreyvasylyuk.javafain24.lesson6;

public class Employee extends Person implements Payable{
    public Employee(String name) {
        super(name);
    }
    
    public boolean increasePay(int percent) {
        System.out.println("Increase salary by " + percent + "%. "+ getName());
        return true;
    }
}
