package ie.atu;

public class preferredCustomer extends Customer{
    private float customerPurchase;
    private float customerDiscount;


    public preferredCustomer(){

    }
     //creating a constructor
    public preferredCustomer(String name, String address, String number, String customerNumber, boolean mailingList, float customerPurchase, float customerDiscount) {
        super(name, address, number, customerNumber, mailingList);
        this.customerPurchase = customerPurchase;
        this.customerDiscount = customerDiscount;
    }

    public float getCustomerPurchase() { //using getters and setters
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

    public float checkCustomerStatus(float customerPurchase){ //creating a function and passing in the customerPurchase float to be used
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
        else if(customerPurchase>=2000){
            System.out.println("10% discount on future purchases ");
            customerDiscount = 10;
        }
        else{
            customerDiscount = 0;
        }
        return customerDiscount; //returning the customerDiscount value
    }

    @Override
    public String toString() {
        return super.toString()+  //super values of preferredCustomer from customer print out
                "customerPurchase=" + customerPurchase +
                ", customerDiscount=" + customerDiscount +
                '}';
    }
}
