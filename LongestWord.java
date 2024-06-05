import java.util.*;
public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, word,lword;
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        word="";
        lword = "";
        str=str+" ";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch==' ') {
                if(word.length()>lword.length())
                {
                    lword = word;
                }
                word="";
            }
            else {
                word = word + ch;
            }
        }
        System.out.println("Longest is: "+lword+" and it's length is "+lword.length());
    }

}
