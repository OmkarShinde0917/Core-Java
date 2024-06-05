import java.util.Scanner;

public class Piglatin {
    public static void main(String args[])
    {
        System.out.print("Enter a word - ");
        Scanner sc = new Scanner(System.in);
        String original = sc.next().toUpperCase();
        int i;

        for(i = 0;i<original.length();i++)
        {
            char chr = original.charAt(i);
            if(chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')
                break;
        }

        if(i == 0)
            System.out.println (original);
        else
        {
            System.out.println ("Piglatin word - " + original.substring(i) +  original.substring(0,i) + "AY");

        }

    }
}