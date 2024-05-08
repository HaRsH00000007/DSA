public class D_Sum_of_1st_n_Natural_numbers {
    public static int Sum(int n){
        if(n==1){       // Base Case
            return 1;
        }

        int Snm1=Sum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Sum(n));
    }
}
