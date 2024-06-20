package hotelgui;

import java.io.*;
import java.util.Scanner;

//method overloading
public class Modify {
    private String filename;
    
    //constructor
    public Modify(String filename) {
        this.filename = filename;
    }
    
    //method with changing room
    public boolean modifyDetails(String name, String phone, String bookedRoom, String email, String country, String checkIn, String checkOut, String room){
        String customerName = name;
        String customerPhone = phone;
        String ExistedRoom = bookedRoom;
        String newEmail = email;
        String newCountry = country;
        String newCid = checkIn;
        String newCod = checkOut;
        String newRoom = room;

        try {
            File inputFile = new File(filename);
            File tempFile = new File("temp.txt");
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            while (scanner.hasNextLine()) {
                String details = scanner.nextLine();
                if (details.contains(customerName) && details.contains(customerPhone) && details.contains(ExistedRoom)) {
                    String[] bookingDetails = details.split(", ");//it will split the data into an array
                    bookingDetails[4] = newEmail;
                    bookingDetails[5] = newCountry;
                    bookingDetails[6] = newCid;
                    bookingDetails[7] = newCod;
                    bookingDetails[8] = newRoom;
                    
                    String newDetails = String.join(", ", bookingDetails); //join back after spliting it in array
                    writer.println(newDetails);
                } else {
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
    
    //method without changing room
    public boolean modifyDetails(String name, String phone, String bookedRoom, String email, String country, String checkIn, String checkOut) {
        String customerName = name;
        String customerPhone = phone;
        String ExistedRoom = bookedRoom;
        String newEmail = email;
        String newCountry = country;
        String newCid = checkIn;
        String newCod = checkOut;

        try {
            File inputFile = new File(filename);
            File tempFile = new File("temp.txt");
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            while (scanner.hasNextLine()) {
                String details = scanner.nextLine();
                if (details.contains(customerName) && details.contains(customerPhone) && details.contains(ExistedRoom)) {
                    String[] bookingDetails = details.split(", ");//it will split the data into an array
                    bookingDetails[4] = newEmail;
                    bookingDetails[5] = newCountry;
                    bookingDetails[6] = newCid;
                    bookingDetails[7] = newCod;
                    
                    String newDetails = String.join(", ", bookingDetails); //join back after spliting it in array
                    writer.println(newDetails);
                } else {
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
