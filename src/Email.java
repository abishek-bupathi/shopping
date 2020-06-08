//Email class prints the email using the data from other classes

public class Email {

    //declaring required variables and objects
    long orderNumber;

    String emailId, firstName;

    Address billingAddress, customerAdress;

    ShoppingCart shoppingCart;

    // initalizing objects and variables using constructor
    Email(long orderNumber1, Address billingAddress1, Address customerAddress1, ShoppingCart shoppingCart1, Customer customer1){

        emailId = customer1.getEmailAddress();
        billingAddress = billingAddress1;
        customerAdress = customerAddress1;
        orderNumber = orderNumber1;
        firstName = customer1.getFirstName();
        shoppingCart = shoppingCart1;


    }

    // emailPrintYes() function prints a positive message and is called when the payament is correct
    public void emailPrintYes(){

        System.out.println("Email ID : "+ emailId);

        System.out.println("\nDear "+firstName+",\n");

        System.out.println("Delivery address: "+customerAdress.getCustomerAddress());
        System.out.println("Billing address: "+billingAddress.getBillingAddress());
        System.out.println();

        System.out.println("The payment for your order with order number : "+orderNumber +" amounting to "+shoppingCart.getTotal()+" euros is successful \nand will be delivered.\n\nThanks and regards,\nOnline shopping centre");


    }

    // emailPrintNo() function prints a negative message and is called when there is payment error
    public void emailPrintNo(){

        System.out.println("Email ID : "+ emailId);

        System.out.println("\nDear "+firstName+",\n");
        System.out.println("Due to payment error, your order is unsuccessful\n\nThanks and regards,\nOnline shopping centre");


    }
}
