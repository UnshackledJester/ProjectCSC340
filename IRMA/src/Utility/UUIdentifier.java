package Utility;

/*
    Utility class for using built in Java UUID method.
    Last updated 4/26/2018.
 */
//Imports.
import java.util.UUID;

//Public class for UUID.
public class UUIdentifier {

    //Generate and return a UUID from Java method.
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
