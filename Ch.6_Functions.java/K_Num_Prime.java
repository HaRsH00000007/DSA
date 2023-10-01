public class K_Num_Prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        // Corner Cases
        // only for n>=2
        //2
        if (n==2){
            return true;
        }

        
        for(int i=2;i<=n-1;i++){
            if(n%i==0){    // -----> Completely Divisible.
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(13));
    }

}
