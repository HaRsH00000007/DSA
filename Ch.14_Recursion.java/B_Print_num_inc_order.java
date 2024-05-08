public class B_Print_num_inc_order {

    public static void Incorder(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        Incorder(n+1);

    }
    public static void main(String args[]){
        int n =1;
        Incorder(n);

    }
}
