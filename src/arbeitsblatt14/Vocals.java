package arbeitsblatt14;

public class Vocals {

    public static void main(String[] args) {
        System.out.println(removeVocals("hello my name is ruben and i live in ravensburg"));
    }

    private static String removeVocals(String input){
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
