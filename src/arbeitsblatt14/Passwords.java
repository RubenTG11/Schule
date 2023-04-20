package arbeitsblatt14;

import java.util.Random;
import java.util.regex.Pattern;

public class Passwords {

    public static String characters = "abcdefghijklmnopqrstuivwxyzABCDEFGHIJKLMNOPQRSTUVFXYZ0123456789!§$%&/()=?´^°";
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            String password = getRandomPassword(new Random().nextInt(20));
            System.out.println(password+": "+isValidPassword(password));
        }
    }

    private static boolean isValidPassword(String password){
        return !password.matches("^(.{0,9}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$");
    }

    private static String getRandomPassword(int length){
        String password = "";

        for(int i = 0; i < length; i++) {
            password += characters.charAt(new Random().nextInt(characters.length()-1));
        }

        return password;
    }

    // 10 Zeichen länge, Groß + Kleinbuchstebane, Ziffern, Sonderzeichen
}
