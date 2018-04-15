package Utility;

import java.io.*;

public class CreateAccount {

    public static void main(String[] args) {
        //set default
        BufferedReader br = null;
        File filename = null;
        FileWriter filewriter = null;
        BufferedWriter bw = null;
        try {
            //read the file
            filename = new File("example.txt");
            filewriter = new FileWriter(filename, true);
            br = new BufferedReader(new InputStreamReader(System.in));
            //write account and password into the file
            //allow user type String
            bw = new BufferedWriter(filewriter);
            System.out.println("Enter your Type(Employee or Manager or Admin):");
            //read characters
            String Type = br.readLine();
            //write to files
            bw.write(Type);
            System.out.println("Create your Username):");
            String Username = br.readLine();
            //write to files
            bw.write("/" + Username);
            System.out.println("Create your Password:");
            String Password = br.readLine();
            bw.write("/" + Password);
            System.out.println("Enter your street:");
            String street = br.readLine();
            bw.write("/" + street);
              System.out.println("Enter the town you live:");
            String town = br.readLine();
            bw.write("/" + town);
              System.out.println("Enter your postcode:");
            String postcode = br.readLine();
            bw.write("/" + postcode);

            //output the data that user typed to file.
            bw.flush();
            //next line
            bw.newLine();
            /*add "/" for matching the format(make a space for verifyAccount method 
            so it stored in file will be look like 
            example:
            Employee/UserA/111111
            Manager/UserB/222222
            Admin/UserC/333333
            Employee/UserD/444444
            Employee/UserE/555555
            End
            \(=.=)/
             */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {    //close file
                br.close();
                bw.close();
                filewriter.close();

            } //throw exception 
            catch (IOException e) {
             System.out.println("Wrong");
           
            }
        }

    }
}
