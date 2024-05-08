public class I_X_Pow_n {
    public static int power(int x,int n){
        if(n==0){           // Base Case
            return 1;
        }

        //int xnm1 = power(x,n-1);
        //int xn = x*power(x,n-1);
        //return xn;

        return x*power(x,n-1);
    }

    public static void main(String args[]){
        System.out.println(power(2,10));
    }
}
