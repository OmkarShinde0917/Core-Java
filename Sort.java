import java.util.Arrays;
import java.util.Scanner;

public class Sort{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strArray = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.nextLine();
        }
        // Print the original array
        System.out.println("Original array:");
        for (String str : strArray) {
            System.out.println(str);
        }
        // Sort the array in ascending order
        Arrays.sort(strArray);
        System.out.println("\nSorted array:");
        for (String str : strArray) {
            System.out.println(str);
        }
        sc.close();
    }
}