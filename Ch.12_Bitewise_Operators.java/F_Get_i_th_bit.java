public class F_Get_i_th_bit {
    public static int getIthbit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0 ;
        }
        else{
            return 1 ;
        }
    }
    public static void main(String args[]){
        System.out.println(getIthbit(10,2));
    }
}
