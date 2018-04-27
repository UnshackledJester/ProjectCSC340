package Utility;

public class Restriction {

    public static boolean validPassword(String password) {
        //verify password by uppercase,lowercase and number
        //The restriction of password: Must have at least one uppercase one lowercase and a number
        //Password has at least 8 char
        String upperCaseChars = "(.*[A-Z].*)";
        String lowerCaseChars = "(.*[a-z].*)";
        String number = "(.*[0-9].*)";
        if (password.length() < 8) {
            return false;
        }

        if (!password.matches(upperCaseChars)) {
            return false;
        }
        if (!password.matches(lowerCaseChars)) {
            return false;
        }
        if (!password.matches(number)) {
            return false;
        }
        return true;
    }

    public static boolean validUsername(String username) {

        //The valid usename can not used by punctuations 
        for (int i = 0; i < username.length(); ++i) {
            if (username.charAt(i) == '\'' || username.charAt(i) == '"' || username.charAt(i) == '@' || username.charAt(i) == '$' || username.charAt(i) == '%') {
                return false;
            }
        }
        return true;
    }

}
