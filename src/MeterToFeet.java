import java.util.*;
public class MeterToFeet {
    public static void main(String[] args) {
        double meters; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length in meters: ");
        meters = sc.nextDouble();

        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
    
}
