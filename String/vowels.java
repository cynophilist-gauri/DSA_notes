import java.util.*;
class vowels {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        int num = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                num++;
            }
        }
        System.out.println(num);
    }
}

/* For consonants
s.charAt(i) != 'a' && s.charAt(i).......
or
s.length() - num

