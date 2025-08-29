import java.util.*;

public class Length_of_number {
    public static void main(String[] args) {
        int num,len;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        len = String.valueOf(num).length();
        System.out.println("Length of the number: " + len);
    }
}
