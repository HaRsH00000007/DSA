public class I_Diamond_Pattern {
    public static void diamond(int n){
        // 1st Half
        for(int i=1;i<=n;i++){
            // Printing Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            // Printing Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

        // 2nd Half
        for(int i=n;i>=1;i--){
            // Printing Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            // Printing Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");

            }
            System.out.println();
    }
}
public static void main (String args[]){
    diamond(5);
}

}