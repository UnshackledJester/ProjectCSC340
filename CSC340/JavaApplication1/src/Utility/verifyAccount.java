package Utility;
import java.util.Scanner;
import java.io.*;




public class verifyAccount {
    public static void main(String args[]) throws FileNotFoundException,Exception{
    //read characters from file
    InputStreamReader ISR = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ISR);
    
    System.out.println("Enter user name");
    String inputUser = br.readLine();
    System.out.println("Enter Password");
    String inputPassword = br.readLine();

    verifyAccount verify =new  verifyAccount();
    verify.readAccount(inputUser,inputPassword );
}

public void readAccount(String inputUser,String inputPassword) throws Exception {
   Scanner scr = new Scanner(new File("example.txt"));
   while(scr.hasNextLine()){
   String line = scr.nextLine();
   String username= line.substring(0,line.indexOf(' '));
   String password =line.substring(line.indexOf(' ')+1,line.length());
      
  //verify method here
   if(inputUser.equals(username) && inputPassword.equals(password) ){
        System.out.println("Your username is:"+username);
        System.out.println("Your Password is:"+password);
       System.out.println("Valid user");
       break;
   } else if(!inputUser.equals(username) || inputPassword.equals(password)){
       System.out.println("Wrong");
   }

   }
  
    }
}