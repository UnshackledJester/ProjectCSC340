package Utility;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DeleteAccount {

    public static void main(String[] args) throws IOException {
        String filename = "example.txt";
        Scanner s = new Scanner(new File(filename));
        Scanner kb = new Scanner(System.in);


        System.out.println("The Username you want delete:");
        String Username = kb.next();

        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()) {
            //get it to array list
            list.add(s.nextLine());
        }

        s.close();
        deleteFromFile(list, Username);

    }

    public static void deleteFromFile(ArrayList<String> list, String search) throws IOException {
        String filename = "example.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < list.size(); i++) {
            int ind = list.get(i).indexOf('/');
            int endPos = list.get(i).indexOf('/', ind+1);
            String name = list.get(i).substring(ind+1, endPos);
            if(!name.equals(search)) {
                writer.write(list.get(i));
                writer.newLine();
            }
        }
        writer.flush();
        writer.close();
    }
}