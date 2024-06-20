/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//definition of class
public class credentials {
private String username;
private String password;

//constructor
public credentials(String u, String p) //for staff login
{
    username = u;
    password = p;
}
 
//method
public boolean loginCredentials() throws IOException{
    File credentials=new File("login_credentials.txt");
    try{
            Scanner inputFile = new Scanner(credentials);
            while (inputFile.hasNext()){
                String userPass = inputFile.nextLine();
                String[] fields = userPass.split(", "); //[data1, data2, data3, data4] *next array*
                if (fields[3].equals(this.username) && fields[4].equals(this.password)) {
                    return true;
                }
            }inputFile.close();
        }
        catch (FileNotFoundException ex)
        {
            throw new RuntimeException("Error: file not found.");
            
        }
        return false;
    }
}

