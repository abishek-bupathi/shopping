// Order class stores the shoping cart items, customer detail, payment details and address to make an order
public class Order {

    // declairng required objects
    Customer customer;
    ShoppingCart shoppingCart;
    Address address;
    Payment payment;



    // initializing the objects using constructor
    public Order(ShoppingCart shoppingCart1, Customer customer1, Address address1, Payment payment1){
        shoppingCart = shoppingCart1;
        customer = customer1;
        address = address1;
        payment = payment1;
    }

    //confirmOrder() function clears the order and updates the transaction.
    public void confirmOrder(){

        System.out.println("Order ID: " + getOrderNumber());
        System.out.println("Order Total: " + shoppingCart.getTotal());
        System.out.println("Time: " + java.time.LocalTime.now().toString().substring(0, 8));
        System.out.println("Status: Order Confirmed\n");

        shoppingCart.clear(); // clearing the shopping cart

    }


    // getOrderNumber() returns a randomly generated number as order Id
    public Long getOrderNumber(){

        return (long) (Math.random()*999999999); // generating random number with Math.random() function

    }


}
