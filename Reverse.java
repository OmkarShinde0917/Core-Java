public class Reverse {
    public static void main(String[] args) {

        String str = "BASIC IS PROGRAMMING";
        str = " " + str + " ";
        String reverse = "";
        int end = str.length();


        // run loop in decreasing order
        for (int i = str.length()-1; i >= 0; i--) {

            if ((str.charAt(i) == ' ')) {
                reverse += str.substring(i, end);
                end = i;
            }
        }
        System.out.println(reverse);

    }
}