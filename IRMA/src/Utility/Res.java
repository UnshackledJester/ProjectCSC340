package Utility;

public class Res {
public static boolean hasLength(CharSequence data) {
    if (String.valueOf(data).length() >= 8) 
        return true;
    else return false;
}

public static boolean hasSymbol(CharSequence data) {
    String password = String.valueOf(data);
    boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
    return hasSpecial;
}

public static boolean hasUpperCase(CharSequence data) {
    String password = String.valueOf(data);
    boolean hasUppercase = !password.equals(password.toLowerCase());
    return hasUppercase;
}

public static boolean hasLowerCase(CharSequence data) {
    String password = String.valueOf(data);
    boolean hasLowercase = !password.equals(password.toUpperCase());
    return hasLowercase;
}
}