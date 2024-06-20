package hotelgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//method overloading
public class Search {
    private JTable table;
    
    //constructor
    public Search(JTable t) {
        table = t;
    }

    //search from delete using identity or passport
    public boolean searchDetails(String identity) {
        boolean isExistOrNot = false;
        try {
            File details = new File("bookingDetails.txt");
            Scanner scanner = new Scanner(details);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Name");
            model.addColumn("Identity");
            model.addColumn("Gender");
            model.addColumn("Phone Number");
            model.addColumn("Email");
            model.addColumn("Country");
            model.addColumn("Check In");
            model.addColumn("Check Out");
            model.addColumn("Room ID");
            model.addColumn("Price");

            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                String[] bookingDetails = info.split(", ");

                if (bookingDetails[1].equals(identity)) {
                    model.addRow(bookingDetails);
                    isExistOrNot = true;
                }
            }

            scanner.close();
            table.setModel(model);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        if (!isExistOrNot) {
            JOptionPane.showMessageDialog(null, "Data not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    //search from view receipt/check out using room id
    public boolean searchDetails(String room, int flag) {
        boolean isExistOrNot = false;
        try {
            File details = new File("bookingDetails.txt");
            Scanner scanner = new Scanner(details);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Name");
            model.addColumn("Identity");
            model.addColumn("Gender");
            model.addColumn("Phone Number");
            model.addColumn("Email");
            model.addColumn("Country");
            model.addColumn("Check In");
            model.addColumn("Check Out");
            model.addColumn("Room ID");
            model.addColumn("Price");

            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                String[] bookingDetails = info.split(", ");

                if (flag == 1) {
                    if (bookingDetails[8].equals(room)) {
                        model.addRow(bookingDetails);
                        isExistOrNot = true;
                    }
                }
            }

            scanner.close();
            table.setModel(model);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        if (!isExistOrNot) {
            JOptionPane.showMessageDialog(null, "Data not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
