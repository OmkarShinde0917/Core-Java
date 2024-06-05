import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;//variable declaration
        char ch;
        System.out.println("a. Addition, b. Subtraction, c. MUltiplication d. Division");
        System.out.println("Enter your choice");
        ch=sc.next().charAt(0);//to input character
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();

        switch(ch)//test expression

        { case 'a': int sum=a+b;
            System.out.println("sum is"+sum); break;
            case 'b': int dif=a-b;
                System.out.println("Difference is"+dif); break;
            case 'c': int prod =a*b;
                System.out.println("Product is"+prod); break;
            case 'd': int div=a/b;
                System.out.println("Quotient is"+div); break;
            default: System.out.println("Invalid choice pls give ( a to d)");

        }//switch close

    }//public close

}//class close

