public class Recursion {
    public static void printInc(int n) {
        if (n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if (n==2){
            return 2;
        }
         return factorial(n-1)*n;
    }

    public static int sumNatural(int n){
        if (n == 1){
            return 1;
        }
        return sumNatural(n-1)+n;
    }

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibonacci(n-2)+ fibonacci(n-1);
    }

    //optimised method
    public static int power(int a, int n){
        if (n == 0){
            return 1;
        }
        int halfpow = power(a, n/2);
        int pow = halfpow * halfpow;

        //n is odd
        if(n%2!=0){
            pow = pow * a;
        }
        return pow;
    }
    public static void main(String[] args) {
        System.out.println( power(5,2));
    }
}
