import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TranspositionVerschluesselung {

    public static void main(String[] args) {
        String[] input = "".toLowerCase().replace(" ", "").split("");

        for(int i = 1; i < input.length; i++){
            double rowLength = Math.floor(input.length/(i+1));

            List<String[]> rows = new ArrayList<>();

            int currentlength = 0;

        }
    }
}
