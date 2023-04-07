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
    
    public static String reverseString(String str) {
        return new StringBuilder(str)
            .reverse()
            .toString();
    }
    
    public static boolean palindromeString(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }
}

// 2 pointer approach
/*
 
 */