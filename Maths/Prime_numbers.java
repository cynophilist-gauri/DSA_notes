/*
 Prime numbers: 2,3,5,7,13....
 (divisible by itself and 1)

 ex. Check for no.36
     1*36 <--
     2*18 <--              
     3*12 <--
     4*9 <--
     6*6
 --> 9*4                       *Getting repeated, since(2*18 = 18*2)
 --> 12*3                      *Hence only check for <= sqrt(n)
 --> 18*2                      *Compexity also changes from O(n) -> O(√n)
 --> 36*1
 */

public class Prime{
public static void main(String args[]){

    int n = 20;
    isPrime(n);

}
}
    static boolean isPrime(int n){
        if(n <= 1){
          return false;
        } 
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
              return false;
            }
            }
        return true;
    }
