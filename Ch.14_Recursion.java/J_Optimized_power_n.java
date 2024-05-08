public class J_Optimized_power_n {
    public static int optimizedpower(int a, int n) {
        if (n == 0) {               // Base Case
            return 1;
        }
        
        // n is even

        // int halfpowerSq=optimizedpower(a,n/2)*optimizedpower(a,n/2);
        int halfpower = optimizedpower(a, n / 2);
        int halfpowerSq = halfpower * halfpower;

        // n is Odd
        if (n % 2 != 0) {
            halfpowerSq=a*halfpowerSq;
        }

        return halfpowerSq;

    }

    public static void main(String args[]){
        int a=2;
        int n=5;
        System.out.println(optimizedpower(a, n));
    }
}
