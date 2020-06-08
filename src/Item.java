// Item class stores the name, price and Id of the items

public class Item {

    // declaring required variables
    private String name;
    private double price;
    private long itemId;

    // Initializing the variables using constructor
    public Item(String itemName, long id) {
        name = itemName;
        itemId = id;
    }

    public void setPrice(double price) // setPrice() function sets the price of the item
    {
        this.price = price;
    }

    public double getPrice() // getPrice() function returns the price of the item
    {
        return price;
    }

    public String getName() // getName() function returns the name of the item
    {
        return name;
    }

    @Override
    public String toString() // toString() function converts data stored as object into string
    {

        String out = "Item Id: " + itemId + "\t" +"Item name: " + name +"\tPrice: " + price +" euros";

        return out;
    }
}
