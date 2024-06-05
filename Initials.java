import java.util.Scanner; // Import the Scanner class for user input

public class Initials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String input = sc.nextLine();

        // Variable to hold the initials
        String initials = "";
        boolean isStartOfWord = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                isStartOfWord = true;
            } else if (isStartOfWord) {
                initials += ch;
                isStartOfWord = false;
            }
        }

        // Display the resulting initials
        System.out.println("Initials: " + initials.charAt(0) + " " + initials.charAt(1) + " " + initials.charAt(2));

        sc.close();
    }
}
