public class C_Factorial {

    public static int factorial(int n){
        if(n==0){           // Base Case
            return 1;
        }

        int fnm1=factorial(n-1);
        int fn= n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.print (factorial(n));
    }
}
