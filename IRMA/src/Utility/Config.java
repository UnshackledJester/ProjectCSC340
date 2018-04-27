package Utility;
/*
    Utility class used for configuring settings. 
    Last updated 4/26/2018.
*/

//Public congig class
public class Config {

    //Filler for use in design; to be worked on in the future, currently only sets text file names.
    public static String getFileDatabase(String type) {
        String fileType = type;
        if (type.equals("Managers")) {
            return "managers.txt";
        } else {
            return "employees.txt";
        }

    }
}
