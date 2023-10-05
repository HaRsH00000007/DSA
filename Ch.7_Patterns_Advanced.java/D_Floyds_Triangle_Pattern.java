public class D_Floyds_Triangle_Pattern {
    
    public static void Floyds_triangle(int n){
        // Outer Loop
        int counter=1;
        for(int i=1;i<=n;i++){
            // Inner Loop ---> How many times will ' counter ' be printed.
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
       

    }
    public static void main(String args[]){
        Floyds_triangle(4);
    }
}
