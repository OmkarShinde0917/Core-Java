import java.util.*;

public class Xavier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English marks");
        int englishmarks = sc.nextInt();
        System.out.println("Enter Maths marks");
        int mathsmarks = sc.nextInt();
        System.out.println("Enter Science marks");
        int sciencemarks = sc.nextInt();

        if(englishmarks>=85 && mathsmarks>=87 && sciencemarks>=86)
        {
            System.out.println("Stream: Pure Science");

        }else if (englishmarks>=80 && mathsmarks>=60 && sciencemarks>=80)
        {
            System.out.println("Stream: Bio Science");

        }else if (englishmarks>=60 && mathsmarks>=60 && sciencemarks>=60)
        {
            System.out.println("Stream: Commerce");

        }else {
            System.out.println("No stream alloted based on provided marks");
        }
        sc.close();

    }

}
