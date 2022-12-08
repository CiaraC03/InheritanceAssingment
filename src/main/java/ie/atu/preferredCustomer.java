package ie.atu;

public class preferredCustomer extends Customer{
    private float customerPurchase;
    private float customerDiscount;


    public preferredCustomer(){

    }

    public preferredCustomer(String name, String address, String number, String customerNumber, boolean mailingList, float customerPurchase, float customerDiscount){
        super(name, address, number, customerNumber, mailingList);
        this.customerPurchase = customerPurchase;
        this.customerDiscount = customerDiscount;
    }

    public float getCustomerPurchase() {
        return customerPurchase;
    }

    public void setCustomerPurchase(float customerPurchase) {
        this.customerPurchase = customerPurchase;
    }

    public float getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(float customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public void checkCustomerStatus(float customerPurchase, float customerDiscount){
        if(customerPurchase>=500 && customerPurchase<=999){
            System.out.println("5% discount on future purchases ");
            customerDiscount = 5;
        }
        else if(customerPurchase>=1000 && customerPurchase<=1499){
            System.out.println("6% discount on future purchases ");
            customerDiscount = 6;
        }
        else if(customerPurchase>=1500 && customerPurchase<=1999){
            System.out.println("7% discount om future purchases ");
            customerDiscount = 7;
        }
        else if(customerPurchase<=2000){
            System.out.println("10% discount on future purchases ");
            customerDiscount = 10;
        }
    }
}
