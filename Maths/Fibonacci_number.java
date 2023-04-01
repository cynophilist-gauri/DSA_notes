//driver code.

class fibonacci{
    public static void main(String args[]){
        //Recursive method
        if( n==0 || n==1 ){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}

/* Iterative method
 int first = 0, second = 1;
        if( n==0 || n==1 ){
            return n;
        }
        int answer = 0;
        for(int i=0; i<=n; i++){
            answer = first + second;
            first = second;
            second = answer;
        }
        return answer;
 */