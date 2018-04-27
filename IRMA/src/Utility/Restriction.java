package Utility;
//Restriction on username and password.

public class Restriction {
//check for the length.

    public static boolean hasLength(CharSequence _data) {
        if (String.valueOf(_data).length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
//check for symbol.

    public static boolean hasSymbol(CharSequence _data) {
        String password = String.valueOf(_data);
        boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
        return hasSpecial;
    }
//check for uppercase.

    public static boolean hasUpperCase(CharSequence _data) {
        String password = String.valueOf(_data);
        boolean hasUppercase = !password.equals(password.toLowerCase());
        return hasUppercase;
    }
//check for lowercase.

    public static boolean hasLowerCase(CharSequence _data) {
        String password = String.valueOf(_data);
        boolean hasLowercase = !password.equals(password.toUpperCase());
        return hasLowercase;
    }
}
