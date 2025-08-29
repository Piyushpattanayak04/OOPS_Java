import java.util.*;

public class Range_Odd_Num 
{
    public static void main(String[] args) 
    {   int n;
        Scanner sc =new Scanner(Syste.in);
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {   if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
