import java.util.Scanner;

public class Table_Print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        if (n>0)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }    
        else
            System.out.println("Enter a valid number");
    }
}
