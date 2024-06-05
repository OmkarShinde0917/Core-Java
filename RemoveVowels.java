import java.util.*;
public class RemoveVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str=str.toLowerCase();
        String result="";

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // Check if the character is not a vowel
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                result += ch;
            }
        }
        // Display the resulting string
        System.out.println("String after removing vowels: "+result);

        sc.close();
    }

}
