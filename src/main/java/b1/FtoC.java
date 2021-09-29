package b1;
import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        float celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        float fahrenheit = input.nextInt();
        celsius = (fahrenheit - 32)*5/9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
