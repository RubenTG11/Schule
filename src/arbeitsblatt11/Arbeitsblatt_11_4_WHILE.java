package arbeitsblatt11;

public class Arbeitsblatt_11_4_WHILE {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10){
            while (j <= 10){
                System.out.print(i*j+" \t");
                j++;
            }
            System.out.println();

            j=1;
            i++;
        }

    }
}
