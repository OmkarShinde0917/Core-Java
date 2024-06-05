import java.util.Scanner;
public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Element of array");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int secondHighest=findsecond(arr);
        System.out.println("The 2nd highest number is: "+secondHighest);
        sc.close();
    }
    public static int findsecond(int[] arr) {
        if (arr.length<2) {
            System.out.println("Enter at least 2 element in array");
            return Integer.MIN_VALUE;
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > highest) {
                secondHighest = highest;
                highest =num;
            }else if(num>secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number in the array");
        }
        return secondHighest;
    }
}
