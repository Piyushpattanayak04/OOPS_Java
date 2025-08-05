import java.util.*;
public class TakeInput
{
    public static void main(String[] args)
    {   int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1  : ");
        num1=sc.nextInt();
        System.out.print("Enter num2  : ");
        num2=sc.nextInt();

         
        System.out.println("The sum is : "+(num1+num2));
        System.out.println("The difference is : "+(num1-num2));
        System.out.println("The product is : "+(num1*num2));
        System.out.println("The quotient is : "+(num1/num2));
        
        
        
    }
}