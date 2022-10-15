public class Palindrome {
    public boolean isPalindrome(int x) {
        String convertIntToString = String.valueOf(x);
        StringBuilder reverseStringBuilder = new StringBuilder("");
        int sizeOfConvertedString = convertIntToString.length();
        for(int i = sizeOfConvertedString - 1; i >= 0; i--) {
            reverseStringBuilder.append(convertIntToString.charAt(i));
        }
        String reverseString = reverseStringBuilder.toString();
        return convertIntToString.equals(reverseString);
    }
}
