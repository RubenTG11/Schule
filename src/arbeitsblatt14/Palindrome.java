package arbeitsblatt14;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome2("Ottod"));
    }
    private static boolean isPalindrome(String input){
        input.replace(" ", "");
        return new StringBuilder(input).reverse().toString().toLowerCase().equals(input.toLowerCase());
    }

    private static boolean isPalindrome2(String input){
        input.replace(" ", "");
        for(int i = 0; i < input.length(); i++){
            if(input.toLowerCase().charAt(i) != input.toLowerCase().charAt(input.length()-(i+1))) return false;
        }

        return true;
    }
}
