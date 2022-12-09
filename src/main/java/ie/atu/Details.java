package ie.atu;

public class Details {
    public static void main(String[] args) {
        preferredCustomer person1 = new preferredCustomer("ciara", "clare", "08539731", "g08437184", true, 1000, 0);
        float discount = person1.checkCustomerStatus(person1.getCustomerPurchase());
        person1.setCustomerDiscount(discount);
        System.out.println(person1);
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
