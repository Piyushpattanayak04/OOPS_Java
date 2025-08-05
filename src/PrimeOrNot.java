import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    num = sc.nextInt();

    if (num <=1)
    {   isPrime = false; }
    else 
    {   for (int i=2; i<=(num/2); i++)
        {   if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime)
        System.out.println(num + " is a prime number.");
     else
        System.out.println(num + " is not a prime number.");



    
    }
}
