//driver code.

public class Fibonacci{

    fib(n);

    public static long fib(int n){
        // Recursive method
        // Slower method
        // This is because the f(n-1) or f(n-2) has already been calculated before but it wasn't saved anywhere.
        // Therefore all the calculations has to be done again.

        if( n==0 || n==1 ){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}

// We are looking for the values already calculated. This is also known as memoization.
{
...
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