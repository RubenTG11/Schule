package arbeitsblatt11;

public class Arbeitsblatt_11_6 {

    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        System.out.println("-------------------");
        System.out.printf("%5s %10s", "x", "f(x)");
        System.out.println();
        System.out.println("-------------------");

        for (int i = -20; i <= 20 ; i=i+2) {

            System.out.format("%5s %10s", i, getValue(i));
            System.out.println();

        }

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }

    private static double getValue(double x){
        return (8*x*x)-(4*x)+6;
    }
}
