package Utility;

import java.util.Scanner;
import java.io.*;

public class verifyAccount {

    public static void main(String args[]) throws FileNotFoundException, Exception {
        //read characters from file
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ISR);

        System.out.println("Enter user name");
        String inputUser = br.readLine();
        System.out.println("Enter Password");
        String inputPassword = br.readLine();

        verifyAccount verify = new verifyAccount();
        verify.readAccount(inputUser, inputPassword);
    }

    public void readAccount(String inputUser, String inputPassword) throws Exception {

        try {
            Scanner scr = new Scanner(new File("example.txt"));

            while (scr.hasNextLine()) {
                String line = scr.nextLine();
                String[] s = line.split("\\/");

                //verify method here
                int i=0;

                    String username = s[i + 1];
                    String password = s[i + 2];
                    if (inputUser.equals(username) && inputPassword.equals(password)) {

                        System.out.println("Welcome " + s[i]);
                        System.out.println("Your username is:" + username);
                        System.out.println("Your Password is:" + password);
                         System.out.println("Your Srteet is:" + s[i+3]);
                        System.out.println("You are the "+s[i]);
                        break;

                    } else if (!inputUser.equals(username) && !inputPassword.equals(password)) {

                        System.out.println("Invaild account");
                        break;

                    }else if ( !inputPassword.equals(password)) {

                        System.out.println("wrong password");
                        break;

                    }else if (!inputUser.equals(username)) {

                        System.out.println("Invaild username");
                        break;

                    }

                
            }
        } catch (IOException e) {

               System.out.println("Wrong");
        }
    }
}
