// Address class stores customer address and billing address as objects

public class Address {


    // declaring required variable
    String address;

    // initalizing the varibale
   public Address (String address1){

        address = address1;

    }

    //declaring required objects
    Address customerAddress;
    Address billingAddress;


    // setCustomerAddress() function sets the delivery address of the customer to the customerAddress object
    public void setCustomerAddress(Address customerAddress1){

      customerAddress = customerAddress1;

    }

    // setBillingAddress() function sets the billing address of the customer to the customerAddress object
    public void setBillingAddress(Address billingAddress1) {

     billingAddress = billingAddress1;

    }

    // getCustomerAddress() function returns the customerAddress as string
    public String getCustomerAddress()
    {
   return customerAddress.toString();
}

    // getBillingAddress() function returns the billingAddress as string
    public String getBillingAddress()
    {
        return billingAddress.toString();
    }

    @Override
    // toString() function converts the data stored in object into string
    public String toString(){

        return address;
    }
}
