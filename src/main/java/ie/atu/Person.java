package ie.atu;
import java.util.Scanner;

public class Person {
    public String name;
    public String address;
    public String number;

    public Person(){

    }
    public Person(String name, String address, String number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
