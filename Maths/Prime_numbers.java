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
