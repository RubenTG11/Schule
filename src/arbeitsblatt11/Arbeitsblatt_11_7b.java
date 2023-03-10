package arbeitsblatt11;

import java.util.Scanner;

public class Arbeitsblatt_11_7b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe einen Endwert an: ");

        int endValue = scanner.nextInt();

        System.out.println(sumUpSequence(endValue*2));
    }

    private static double sumUpSequence(int end){
        if(end == 2) return 4;
        return (end*end) + sumUpSequence(end-2);
    }
}
