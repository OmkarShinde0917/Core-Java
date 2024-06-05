import java.util.Scanner;
public class DisplaySurnameFirst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = sc.nextLine();

        // Split the input string into individual words
        String[] words = input.split(" ");

        if (words.length == 3) {
            String surname = words[2];
            String firstName = words[0];
            String middleName = words[1];

            System.out.println("Name in desired order: " + surname + " " + firstName + " " + middleName);
        } else {
            System.out.println("Please enter a name containing exactly three words.");

            sc.close();
        }
    }
}
