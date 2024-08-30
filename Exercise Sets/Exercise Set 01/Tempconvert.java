import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");

        double c = input.nextDouble();
        double f = (c*9)/5+32;

        String formattedc = String.format("%.2f", c);
        String formattedf = String.format("%.2f", f);
        System.out.println(formattedc+" Celsius is " +formattedf+ " Fahrenheit");
        input.close();
    }
}
