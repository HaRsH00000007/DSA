public class M_Primes_in_Range {
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){   // If it's True
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInRange(20);
    }
    
}
