public class E_Odd_or_Even {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            // even number
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]){
        oddoreven(3);
        oddoreven(4);
        oddoreven(7);
    }
}
