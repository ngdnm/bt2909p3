package b4;
import java.util.Scanner;
public class Minute {
    public static void main(String[] args) {
        int years,days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of minutes : ");
        int minutes = sc.nextInt();
        years = (minutes / (60 * 24 * 365));
        days  = (minutes / 60 / 24) % 365;
        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");
    }
}
    
