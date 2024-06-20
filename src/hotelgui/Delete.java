package hotelgui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//class
class bookingDetails {
    private String customerIdentity;
    private String customerPhone;
    private String customerEmail;
    private String customerRoom;
    
    //constructor
    public bookingDetails(String customerIdentity, String customerPhone, String customerEmail, String customerRoom) { //identity: 0123456789 will enter here first
        this.customerIdentity = customerIdentity;//it will throw it to the private variable
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerRoom = customerRoom;
    }

    public String getCustomerIdentity() { //final return the 0123456789 called from private variable will enter here for public class to call
        return customerIdentity;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    
    public String getCustomerRoom() {
        return customerRoom;
    }

}

public class Delete {
    public boolean deleteDetails(String filename, String customerIdentity, String customerPhone, String customerEmail, String customerRoom) {
    try {
        File tempFile = new File("temp.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));
        File inputFile = new File(filename);
        Scanner scanner = new Scanner(inputFile);
        
        while (scanner.hasNext()) {
            String details = scanner.nextLine();
            String[] detail = details.split(", ");
            bookingDetails BookingDetails = new bookingDetails(detail[1],detail[3],detail[4],detail[8]);
            //   if the booking details from the text file does not contains the data from the table selected row
            if (!BookingDetails.getCustomerIdentity().contains(customerIdentity) || !BookingDetails.getCustomerPhone().contains(customerPhone) 
                    || !BookingDetails.getCustomerEmail().contains(customerEmail) || !BookingDetails.getCustomerRoom().contains(customerRoom)) {
            writer.println(details);
            
            }
        }

        scanner.close();
        writer.close();

        inputFile.delete();
        tempFile.renameTo(new File(filename));

    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}
}
