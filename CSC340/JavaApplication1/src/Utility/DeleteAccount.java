package Utility;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
There are some issue about output to the file.
I am trying to make the writing style output to file like 
UserA 111111
UserB 222222
UserC 333333
but after delete(for example I delete UserB) the output will like :
UserA 
111111
UserC 
333333
Which mean if I want to go back to verify it again it will be showing wrong. 
I have no idea how to fix that(it should be in the output part),if you know the sloution feel free to change it
*/
public class DeleteAccount {
     private static Scanner x;
    public static void main(String[] args) throws IOException {
        String filename = "example.txt";
        Scanner s = new Scanner(new File(filename));
        Scanner kb = new Scanner(System.in);
    

        System.out.println("The Usename you want delete:");
        String Username = kb.next();

        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            //get it to array list
            list.add(s.next());
            list.add(s.next());
        }

        deleteFromFile(list, Username);
        
    } 
  
    public static void deleteFromFile(ArrayList<String> list, String search) throws IOException {
           String filename = "example.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(search)) {
                //remove twice because we have the account and password need to be remove together
                list.remove(i);  
                list.remove(i);
               
            } 
        }
        for(String str:list){
        // output the String 
        writer.write(str);       
        writer.flush();
        writer.newLine();
        }
        writer.close();
       System.out.println(list.toString());
    }
 
    
}

