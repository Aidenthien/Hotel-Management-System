package hotelgui;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

//class 
public class auditLog {
    private String activity;
    
    //method
    public void auditLog(String activity){
        String timeDate = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss").format(new Date());
        String log = timeDate + " | " + activity;
        try{
                FileWriter fw = new FileWriter("auditLog.txt",true);
                PrintWriter outputFile = new PrintWriter(fw);
                outputFile.println(log);
                outputFile.close();
        }catch (Exception ex){
            System.out.print(ex);
        }
    }
}
