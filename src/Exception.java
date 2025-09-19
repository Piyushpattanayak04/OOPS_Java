import java.util.*;

class Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("First Number ");
        a=sc.nextInt();
        System.out.print("Second Number ");
        b=sc.nextInt();
        // c=a/b;
        // System.out.println("Result ="+c);
        // System.out.print("Some Other Work");

        try{
            c=a/b;
            System.out.println("Result ="+c);
        }catch(ArithmeticException e){
            System.out.println("You cannot divide a number by zero");
        }
        System.out.print("Some Other Work");
    }
}
