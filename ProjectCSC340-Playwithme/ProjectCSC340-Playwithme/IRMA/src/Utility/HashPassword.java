package Utility;
import java.util.HashMap;
import java.util.Map;

public class HashPassword {
  //  String str; 
   static  Map<Character,Character> map1=new HashMap<Character,Character>();
   static  Map<Character,Character> map2=new HashMap<Character,Character>();
   HashPassword(){
       //set the hash maps
        String PasswordChecking="abcdefghijklmnopqrstuvwsxyz*0123456789_QWERTYUIOPASDFGHJKLZXCVBNM";
        String TranslateTable="9876543210*abcdefghijklmnopqrstuvwsxyzMNBVCXZ_LKJHGFDSAPOIUYTREWQ";
        for(int i=0;i<PasswordChecking.length();i++){
            //map1 changes all the chars from password to the translatetable
            map1.put(PasswordChecking.charAt(i),TranslateTable.charAt(i));
            //flip back from the hashed password
            map2.put(TranslateTable.charAt(i),PasswordChecking.charAt(i));
        }
    }
   // Hashing a password
   public  static String encryption(String Password){
        String password= Password;
        //set defult to empty
       String HashedPassword = "";
       //get chars from translate table
       for (int i = 0; i < password.length(); i++) {
           HashedPassword = HashedPassword + map1.get(password.charAt(i));
       }
       return HashedPassword;
    }
   // decryption the password
    public static String decryption(String Password){
        String NormalPassword = "";
        for (int i = 0; i < Password.length(); i++) {
            NormalPassword = NormalPassword + map2.get(Password.charAt(i));
        }
        return NormalPassword;
    }
}