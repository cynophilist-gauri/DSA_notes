// Using the StringBuilder reverse() method
// O(n)
import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = read.next();
        boolean isPalindrome = palindromeString(s);
        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}

// Using a loop to compare characters
/* O(n)
public static boolean isPalindrome(String str) {
    if (str == null) {
        return false;
    }
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - i - 1)) {
            return false;
        }
    }
    return true;
}
*/


// 2 pointer approach
/* O(n^2)
 public static boolean palindromeString(String str) {
        String reversed = reverseString(str);
        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.equalsIgnoreCase(reversed)){
                return true;
            }
            i++; j++;
        }
        return false;
    }
 */


 // Using recursion
 /* O(n)
 public static boolean isPalindrome(String str) {
    if (str == null) {
        return false;
    }
    if (str.length() == 0 || str.length() == 1) {
        return true;
    }
    if (str.charAt(0) == str.charAt(str.length() - 1)) {
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    return false;
}
*/