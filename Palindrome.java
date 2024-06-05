import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No:");
        int number = sc.nextInt();

        if(Palindrome(number)) {
            System.out.println("The no is Palidrome");
        }else {
            System.out.println("The no is not Palidrome");

        }
        sc.close();
    }
    public static boolean Palindrome(int number) { // finding palindrome number
        int reverse = 0;// taking initial value 0
        int  original = number;
        while(number != 0) { //number is not equal to 0 the loop will continue
            int digit = number%10;// if no. 121 then 121%10=1
            reverse = reverse*10+digit;//0*10+1=1
            number/=10;//121/10=12
        }
        return original==reverse;


    }

}