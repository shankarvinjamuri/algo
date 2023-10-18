public class StringOperations {

    public static void main(String[] args) {
        // Concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        String concatResult = str1 + str2;

        // Substring Extraction
        String str = "Hello, World!";
        String substrResult = str.substring(7, 12);

        // String Length
        int length = str.length();

        // String Comparison
        String compareStr1 = "apple";
        String compareStr2 = "orange";
        boolean isEqual = compareStr1.equals(compareStr2);
        int compareResult = compareStr1.compareTo(compareStr2);

        // Case Conversion
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        // Trimming and Padding
        String trimStr = "   Hello, World!   ";
        String trimmed = trimStr.trim();
        String padded = String.format("%20s", trimStr);

        // Results
        System.out.println(concatResult + " " + substrResult + " " + length + " " + isEqual + " " + (compareResult < 0) + " " + upper + " " + lower + " " + trimmed + " " + padded);
    }

    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
      }
}
