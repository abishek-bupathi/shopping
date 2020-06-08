// shopping cart class manages and stores the items in the cart


import java.util.ArrayList;

public class ShoppingCart {

    // declaring required variables and objects
    long cartID;
    String time;
    boolean flag;

    double total;

    Customer customer;

    // creating an array list to store items
    ArrayList<Item> items = new ArrayList<>();


    // initalizing variables using constructors
    public ShoppingCart(Customer customer1){

        flag = false;
        time = "";
        total = 0.0;
        customer = customer1;
        cartID = createId();

    }

    // addItem() function add items object to the array list
    public void addItem(Item item){
        // if condition for checking whether the cart is closed
        if (!flag) {
            items.add(item); // adding item to array list using add() function
            total += item.getPrice(); // price of the item is added and stored in the variable total
        }
        else
            System.out.println("Sorry the shopping cart is closed item cannot be added \n"); // negative message to print if cart is close

     }

    // removeItem() function removes specific item from the array list
    public void removeItem(Item item){

        // if condition to check whether the cart is close
        if (!flag) {
            items.remove(item); // removing item from the cart using remove() function
            total -= item.getPrice(); // subtracting the price of the item from the total
        }else
            System.out.println("Sorry the shopping cart is closed"); // negative message to print when cart is closed
    }

    // getTotal() function returns the value of total variable
    public double getTotal(){

        return total;
    }

    // getCartId() function returns the cart id
    public long getCartId(){
        return cartID;
    }

    public void setTime(){

        time =java.time.LocalTime.now().toString();
    }

    // printItems() function prints all the items in the array list
    public void printItems(){
            for (Item item : items) // for loop to run through each elements in the array list
                System.out.println(item);
            System.out.println();

    }

    // getItems() function returns item object
    public ArrayList getItems(){
        return items;
    }

    // close() function closes the cart by updating th flag value to true
    public void close(){
        System.out.println("Shopping cart is now closed");
        System.out.println();
        flag = true;
    }

    // clear() function deletes all the elements in the array list
    public void clear(){
        items.clear();
    }

    public Long createId(){
        return (long) (Math.random()*999999999); // generating random number with Math.random() function
    }
}
