//inheritance/method overriding

package hotelgui;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

//superclass
class User {
    private String name;
    private String gender;
    private String dob;
    private String username;
    private String password ;
    
    //constructor
    public User(String n, String g, String d, String u, String p) {
        username = u;
        password = p;
        name = n;
        gender = g;
        dob = d;
    }
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String writeRecord() {
        try {
            FileWriter fw = new FileWriter("login_credentials.txt", true);
            PrintWriter outputFile = new PrintWriter(fw);
            outputFile.println(name + ", " + gender + ", " + dob + ", " + username + ", " + password);
            outputFile.close();
            return "Success";
        } catch (Exception ex) {
            return ex.toString();
        }
    }

}

//subclass
public class AddCustomer extends User {
    private String checkIn;
    private String checkOut;
    private String room;
    private int price;
    private String email;
    private String phone;
    private String country;
    private String identity;

    public AddCustomer(String n, String i, String g, String pn, String e, String c, String cid, String cod, String r, int p) {
        super(n, g, null, null, null); //runs the superclass constructor
        checkIn = cid;
        checkOut = cod;
        room = r;
        price = p;
        email = e;
        phone = pn;
        country = c;
        identity = i;
    }

    // overriding method
    @Override
    public String writeRecord() {
        try {
            File file = new File("bookingDetails.txt");
            FileWriter fw = new FileWriter(file, true);
            PrintWriter outputFile = new PrintWriter(fw);
            outputFile.println(getName() + ", " + identity  + ", " + getGender() + ", " + phone + ", " + email + ", " + country 
                    + ", " + checkIn + ", " + checkOut + ", " + room + ", " + price);
            outputFile.close();
            return "Success";
        } catch (Exception ex) {
            return ex.toString();
        }
    }

}
