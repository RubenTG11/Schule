package arbeitsblatt13;

import java.util.Scanner;

public class Arbeitsblatt_13_INTRO {
    public static void main(String[] args) {
        String password = "simsalabim";
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int versuch = 0;

        do{
            System.out.print("(Versuch "+(versuch+1)+") Gebe dein Passwort ein: ");
            input = scanner.next();

            versuch++;

            if(input.equals(password)) {
                System.out.println("Richtig!");
            }else if(!input.equals(password) && versuch != 3) {
                System.out.println("Leider Falsch! Versuch es noch einmal!");
            }else if(!input.equals(password) && versuch == 3){
                System.out.println("Zu viele Versuche!");
            }

        } while (!password.equals(input) && versuch < 3);
    }
}
