// TransactionTest class runs the transaction of 2 different scenarios

public class TransactionTest
{

    /**
     * main method to execute the TransactionTest methods
     */
    public static void main(String[] args)
    {
        TransactionTest test = new TransactionTest(); // creating class object
        test.transaction1(); // calls the method with test scenario 1
        test.transaction2(); // calls the method with test scenario 2
    }

    // transaction1() method executes the transaction as per scenario 1

    public void transaction1(){

        System.out.println("Transaction 1: \n");



        //1. Create New Customer
        Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");


        System.out.println("Customer ID: "+customer.getId());
        System.out.println();


        // creating delivery addresses
        Address deliveryAddress = new Address("253, Goldcrest village, upper Newcastle, Galway, Ireland, H91QW21");

        deliveryAddress.setCustomerAddress(deliveryAddress); // setting delivery address

        // creating billing address
        Address billingAddress = new Address("11/14, Kalinjur, Vellore, Tamilnadu, India, 632006");

        billingAddress.setBillingAddress(billingAddress); // setting billing address


        // creating item 1
        Item item1 = new Item("Apple", 2317);
        item1.setPrice(3.50);

        // creating item 2
        Item item2 = new Item("Banana", 1232);
        item2.setPrice(2.50);

        //creating item 3
        Item item3 = new Item("Grapes", 4328);
        item3.setPrice(2.99);


        // creating shopping cart
        ShoppingCart shoppingCart = new ShoppingCart(customer);

        System.out.println("Cart Id: " +shoppingCart.getCartId());
        System.out.println();


        // adding items to cart
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.printItems(); // printing items from the cart
        shoppingCart.close(); // closing the shopping cart


        // creating new payment
        Payment payment = new Payment(customer, billingAddress, "visa", "4389123456893245", "State Bank of India", "12/09/2022");

        // creating new order
        Order order = new Order(shoppingCart,customer,deliveryAddress, payment);
        // creating new email with details
        Email email = new Email(order.getOrderNumber(), billingAddress, deliveryAddress,shoppingCart,customer);

        // checking whether payment is valid or not
        if(payment.isValid()){
            // confirming order if payment is valid
            order.confirmOrder();
            //printing email
            email.emailPrintYes();
        }
        else {
            // printing negative message id payment is not valid
            System.out.println("Order status: Unsuccessful\n");
            email.emailPrintNo();
        }

    }

    // transaction2() function runs the transaction as per scenario 2
    public void transaction2(){

        System.out.println("\n \nTransaction 2: \n");


        //1. Create New Customer
        Customer customer = new Customer("Abishek", "Bupathi", "abishekb128@gmail.com");

        // creating new delivery address
        Address deliveryAddress = new Address("253, Goldcrest village, upper Newcastle, Galway, Ireland, H91QW21");
        // creating new billing address
        Address billingAddress = new Address("11/14, Kalinjur, Vellore, Tamilnadu, India, 632006");

        deliveryAddress.setCustomerAddress(deliveryAddress); // setting delivery address
        billingAddress.setBillingAddress(deliveryAddress); // setting billing adress

        System.out.println("Customer ID: "+customer.getId());
        System.out.println();

        // creating 3 items
        Item item1 = new Item("Samsung galaxy note 10 plus", 89608767);
        item1.setPrice(1180.00);

        Item item2 = new Item("Dell xps 15", 2314534);
        item2.setPrice(3150.80);

        Item item3 = new Item("Sony WHX1000", 4328);
        item3.setPrice(465.00);


        ShoppingCart shoppingCart = new ShoppingCart(customer); // creating shopping cart

        System.out.println("Cart Id: " +shoppingCart.getCartId());
        System.out.println();


        // adding items to the cart
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.printItems(); // printing items from the cart

        System.out.println("Shopping cart Total: "+shoppingCart.getTotal()); // display cart total
        System.out.println();

        shoppingCart.removeItem(item1); // removing item 1 from the cart
        System.out.println(item1.getName()+" is removed from the cart\n");
        System.out.println("Shopping cart Total: "+shoppingCart.getTotal()); // display cart total
        System.out.println();


        shoppingCart.close(); // closing the shopping cart

        // creating 4th item
        Item item4 = new Item("Samsung Galaxy tab S6", 4231);
        item3.setPrice(465.00);

        System.out.println("Trying to Adding item :"+item4.getName());
        System.out.println();

        shoppingCart.addItem(item4); // trying to add 4th item

        // creating new payment
        Payment payment = new Payment(customer, billingAddress, "MrCard", "43895", "State Bank of India", "12/09/2022");

        // creating new order
        Order order = new Order(shoppingCart,customer,deliveryAddress, payment);
        // creating new email
        Email email = new Email(order.getOrderNumber(), billingAddress, deliveryAddress,shoppingCart,customer);

        // condition to check payment validity
        if(payment.isValid()){
            // confriming order and sending email if payment is valid
            order.confirmOrder();
            email.emailPrintYes();
        }
        else {
            // negative message when payment failed
            System.out.println("Order status: Unsuccessful\n");
            email.emailPrintNo();
        }

    }

}
