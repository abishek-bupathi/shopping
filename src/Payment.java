// Payment class holds the details of credit card and checks if its valid or not

import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment {

    // Declaring required objects and variables

    Customer customer;

     String creditCardType, bankName, cardNumber, expiryDate;
        Address address;


        // initializing the variables using constructor
     Payment(Customer customer1, Address address1, String creditCardType1, String cardNumber1, String bankName1, String expiryDate1){

         customer = customer1;
         address = address1;
         creditCardType = creditCardType1;
         cardNumber = cardNumber1;
         bankName = bankName1;
         expiryDate = expiryDate1;

     }

     // isValid() function checks whether the details of the card are valid or not
     public boolean isValid() {

         // declaring required variables for storing details of card

         int expiryDay, expiryMonth, expiryYear, currentDay, currentMonth, currentYear;

         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // creating formatter to convert date into readable form
         Date date = new Date(); // creating new date using inbuilt java function
         String currentDate = formatter.format(date); // formatting date

         expiryDay = Integer.parseInt(expiryDate.substring(0, 2)); // extracting day from the expiry date of the card
         expiryMonth = Integer.parseInt(expiryDate.substring(3, 5)); // extracting month from the expiry date of the card
         expiryYear = Integer.parseInt(expiryDate.substring(6)); // extracting year from the expiry date of the card

         currentDay = Integer.parseInt(currentDate.substring(0, 2)); // extracting day from the current date
         currentMonth = Integer.parseInt(currentDate.substring(3, 5)); // extracting month from the current date
         currentYear = Integer.parseInt(currentDate.substring(6));  // extracting year from the current date


         // if condition to check whether expiry date of the card is in future
         if (currentYear < expiryYear || currentYear == expiryYear && currentMonth < expiryMonth || currentYear == expiryYear && currentMonth == expiryMonth && currentDay < expiryDay) {

             // if condition to check whether the card type and card number digit length is correct
             return cardNumber.length() == 16 || cardNumber.length() == 19 && creditCardType.compareToIgnoreCase("MasterCard") == 1 || creditCardType.compareToIgnoreCase("visa") == 1;


         }
         else
         return false;
      }
}