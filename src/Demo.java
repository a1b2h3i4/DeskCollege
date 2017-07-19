
import java.awt.Toolkit;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo 
{
public static void main(String[] args) {
    FileOutputStream fout=null;
    try {
        String s=new Scanner(System.in).nextLine();
        File f=new  File("tmpfile.txt");
        FileWriter fw=new  FileWriter(f);
        fout = new FileOutputStream(f);
        DataOutputStream dout=new DataOutputStream(fout);
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getHeight()+" "+Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        dout.writeBytes(s);
    } catch (Exception ex) {
     
    }}}
