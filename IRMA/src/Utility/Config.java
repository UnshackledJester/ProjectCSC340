package Utility;
//for use in configuring options.

public class Config {

    //Filler for use in design; to be worked on in the future as an interface
    public static String getFileDatabase(String type) {
        String fileType = type;
        if (type.equals("Managers")) {
            return "managers.txt";
        } else {
            return "employees.txt";
        }

    }
}
