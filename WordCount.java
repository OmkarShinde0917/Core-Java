import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        int count = 0;
        String[] words = sentence.split(" ");

        // Loop through each word in the sentence
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }

        System.out.println("The word \"" + word + "\" appears " + count + " times in the sentence.");

        scanner.close();
    }
}
