// Using for reverse loop
// O(n^2)
import java.util.*;
class reverse_string {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String reversed = "";
        System.out.println("Enter the String");
        String s = read.next();
        for(int i=s.length()-1; i>=0; i--){
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);
    }
}

// Using for loop
/* O(n^2)
  for(int i=0; i<s.length(); i++){
            reversed = s.charAt(i) + reversed;
        }
 */


 // Using recursion
 /* O(n)
 import java.util.*;
 class reverse_string {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         System.out.println("Enter the String");
         String s = read.next();
         String reversed = reverse(s);
         System.out.println(reversed);
     }
     public static String reverse(String s){
             if(s.isEmpty()){
                 return s;
             }
             return reverse(s.substring(1)) + s.charAt(0);
         }
 }
 */

 // Using StringBuilder
 /* O(n)
import java.util.*;
class reverse_string {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = read.next();
        String reversed_String = reverseString(s);
        System.out.println(reversed_String);
    }
    public static String reverseString(String s){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        }
}
  */

// Using Java 8 streams
/*public static String reverseString(String str) {
    return new StringBuilder(str)
            .reverse()
            .toString();
}
*/