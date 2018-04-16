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

            //write account and password into the file
            //allow user type String
            bw = new BufferedWriter(filewriter);
            System.out.println("Create Username:");
            //read characters
            br = new BufferedReader(new InputStreamReader(System.in));
            String Username = br.readLine();
            //write to files
            bw.write(Username);
            
            System.out.println("Create password:");
            br = new BufferedReader(new InputStreamReader(System.in));
            String Password = br.readLine();
            /*add " " for matching the format(make a space for verifyAccount method 
            so it stored in file will be look like 
            example:
            UserA 111111
            UserB 222222
            UserC 333333
            End
            \(=.=)/
            */
            bw.write(" " + Password);
            //output the data that user typed to file.
            bw.flush();
            //next line
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {    //close file
                br.close();
                bw.close();
                filewriter.close();

            } //throw exception 
            catch (IOException e) {

                e.printStackTrace();
            }
        }

    }
}