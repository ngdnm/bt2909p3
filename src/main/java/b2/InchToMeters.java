package b2;
import java.util.Scanner;
public class InchToMeters {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
    

