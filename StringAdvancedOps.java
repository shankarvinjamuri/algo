import java.util.Arrays;
public class StringAdvancedOps {

  public static boolean isPalindrome(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
  }

  public static boolean isAnagram(String str1, String str2) {
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
  }

  public static String longestCommonSubstring(String str1, String str2) {
    int[][] lengths = new int[str1.length() + 1][str2.length() + 1];
    int longest = 0;
    int longestIdx = 0;
    for (int i = 1; i <= str1.length(); i++) {
      for (int j = 1; j <= str2.length(); j++) {
        if (str1.charAt(i-1) == str2.charAt(j-1)) {
          lengths[i][j] = lengths[i-1][j-1] + 1;
          if (lengths[i][j] > longest) {
            longest = lengths[i][j];
            longestIdx = i-1; 
          }
        }
      }
    }
    return str1.substring(longestIdx - longest + 1, longestIdx + 1);
  }

  public static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
  }

    

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar")); // true
    System.out.println(isAnagram("listen", "silent")); // true
    System.out.println(longestCommonSubstring("ABABC", "BABCAC")); // "BABC"
    System.out.println(reverseString("hello")); // "olleh"
  }
}