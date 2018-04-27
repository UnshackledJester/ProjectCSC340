package Utility;

import java.util.HashMap;
import java.util.Map;

public class HashPassword {
    //  String str; 

    static Map<Character, Character> map1 = new HashMap<Character, Character>();
    static Map<Character, Character> map2 = new HashMap<Character, Character>();

    HashPassword() {
        //hash map
        String PasswordChecking = "abcdefghijklmnopqrstuvwsxyz*0123456789QWERTYUIOPASDFGHJKLZXCVBNM_";
        String TranslateTable = "9876543210*abcdefghijklmnopqrstuvwsxyzMNBVCXZ_LKJHGFDSAPOIUYTREWQ";
        //9876543210*abcdefghijklmnopqrstuvwsxyzMNBVCXZ_LKJHGFDSAPOIUYTREWQ
        for (int i = 0; i < PasswordChecking.length(); i++) {
            map1.put(PasswordChecking.charAt(i), TranslateTable.charAt(i));
            map2.put(TranslateTable.charAt(i), PasswordChecking.charAt(i));
        }
    }
    // Hashing a password

    public static String encryption(String Password) {
        String password = Password;
        String HashedPassword = "";
        for (int i = 0; i < password.length(); i++) {
            HashedPassword = HashedPassword + map1.get(password.charAt(i));
        }
        return HashedPassword;
    }
    // get the password back from hashing

    public static String decryption(String Password) {
        String NormalPassword = "";
        for (int i = 0; i < Password.length(); i++) {
            NormalPassword = NormalPassword + map2.get(Password.charAt(i));
        }
        return NormalPassword;
    }

    public static String Hashed(String hashed) {
        HashPassword HP = new HashPassword();
        String str = hashed;
        String str1 = HashPassword.encryption(str);
        return str1;

    }

    public static String deHashed(String dehashed) {
        HashPassword HP = new HashPassword();
        String str = dehashed;
        String str1 = HashPassword.decryption(str);
        return str1;

    }
}
