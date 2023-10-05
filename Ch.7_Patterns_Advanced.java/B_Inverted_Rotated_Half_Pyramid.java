public class B_Inverted_Rotated_Half_Pyramid {
    public static void inverted_rotated_half_pyramid(int n){ // n ---> represents no. of rows
        // Outer Loop
        for(int i=1;i<=n;i++){
            // Printing Spaces
            for(int j=1;j<=n-i;j++){ 
            System.out.print(" ");
         }

            // Printing Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        inverted_rotated_half_pyramid(4);
    }
}
