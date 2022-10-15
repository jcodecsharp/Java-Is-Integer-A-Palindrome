import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        System.out.println("Enter a number to test if it is a palindrome: ");
        int testNumber = scanner.nextInt();
        boolean isPalindrome = palindrome.isPalindrome(testNumber);
        System.out.println("Number: " + testNumber + "\nisPalindrome: " + isPalindrome);
    }
}
