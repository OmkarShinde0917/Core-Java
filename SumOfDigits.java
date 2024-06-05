public class SumOfDigits {
    public static void main(String[] args) {
        int number = 27168; // Change this number to test different inputs

        int result = sumOfDigitsUntilSingleDigit(number);

        System.out.println("Sum of digits until single digit: " + result);
    }

    public static int sumOfDigitsUntilSingleDigit(int num) {
        // Continue looping until the sum becomes a single digit
        while (num >= 10) {
            int tempSum = 0;

            // Calculate the sum of digits of the current number
            while (num > 0) {
                tempSum += num % 10;
                num /= 10;
            }

            num = tempSum;
        }

        return num;
    }
}
