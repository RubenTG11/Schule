package arbeitsblatt11;

import java.util.Scanner;

public class Arbeitsblatt_11_7a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe einen Endwert an: ");

        int endValue = scanner.nextInt();

        System.out.println(sumUpSequence(endValue));
    }

    private static double sumUpSequence(int end){
        if(end == 1) return 1;
        return (end*end) + sumUpSequence(end-1);
    }
}
