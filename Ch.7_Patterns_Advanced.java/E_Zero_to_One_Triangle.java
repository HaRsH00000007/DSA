public class E_Zero_to_One_Triangle {
    public static void Zero_one_Triangle(int n){
        for(int i=1;i<=n;i++){
            // Inner Loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Zero_one_Triangle(5);
    }
}
