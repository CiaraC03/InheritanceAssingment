package ie.atu;

public class Details {
    public static void main(String[] args) {
        Person Ciara = new Person("Ciara", "Galway", "12345678");
        System.out.println(Ciara.toString());
        Customer Chloe = new Customer("Ciara", "Galway", "123456789", "987654321", true);
        System.out.println(Chloe.toString());

        Customer Patrick = new Customer();
        Patrick.setName("Patrick");
        Patrick.setAddress("Peru");
        Patrick.setNumber("999");

        System.out.println("Name : " + Patrick.getName() + "Address : " + Patrick.getAddress() + "Number : " + Patrick.getNumber());
    }

}
