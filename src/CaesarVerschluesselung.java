import java.util.List;

public class CaesarVerschluesselung {

    public static void main(String[] args) {
        String[] input = "Avkqk bfveeve nzi jvyve urjj uzv KX Bcrjjv vcw qnvz xreqe jtyfve tcvmvi zjk jkzddk ufty fuvi".toLowerCase().replace(" ", "").split("");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        List alphabetList = List.of(alphabet.split(""));

        for(int i = 0; i < 26; ++i){
            String shifted = alphabet.substring(i+1)+alphabet.substring(0, i+1);
            List shiftedAlphabetList = List.of(shifted.split(""));

            StringBuilder stringBuilder = new StringBuilder();

            for (String s : input) {
                stringBuilder.append(shiftedAlphabetList.get(alphabetList.indexOf(s)));
            }


        }
    }

}
