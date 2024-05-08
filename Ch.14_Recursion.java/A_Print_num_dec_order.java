public class A_Print_num_dec_order{
    public static void Decorder(int n){
        if(n==1){           //--> Base Case
            System.out.println(n);
            return;
        }
        System.out.print(n+" "); // Printing f(n) 
        Decorder(n-1);           // Printing f(n-1) --> Inner function
    }
    public static void main(String args[]){
        int n=10;
        Decorder(n);
    }
}