
// customer class stores name of customer, email address and Id

public class Customer {

    // declaring required variables
    private String firstName;
    private String surName;
    private String emailAddress;
    private final long customerId;

    // initializing the variables using constructors
    public Customer(String firstName, String surName, String emailAddress){
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId  = makeCustomerId();
    }

    public long getId() // getId() function returns the customer Id
    {
        return customerId;
    }


    public String getFirstName() // getFirstName() function returns the first name of the customer
    {
        return firstName;
    }

    public String getSurName() // getSurName() function returns the surname of the customer
    {

        return surName;
    }

    public String getEmailAddress() // getEmailAddress() function returns the email Id of the customer
    {
        return emailAddress;
    }

    private long makeCustomerId() // makeCustomerId() create random number for customer Id
    {
        return (long)(Math.random() * 99999999999999L); // creating random number using Math.random() inbuilt function
    }


}
