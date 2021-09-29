package b5;
import java.util.Scanner;
public class distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float timeSeconds;
        float mps,kph,mph;
        System.out.println("input distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.println("input hour: ");
        float hour = scanner.nextFloat();
        System.out.println("Input minutes: ");
        float min = scanner.nextFloat();
        System.out.println("Input seconds: ");
        float sec = scanner.nextFloat();
        
        timeSeconds =(hour*3600)+(min*60)+sec;
        mps = distance / timeSeconds;
        kph = (distance/1000.0f) / (timeSeconds/3600.0f);
        mph=kph/1.609f;
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);       
    }    
}
