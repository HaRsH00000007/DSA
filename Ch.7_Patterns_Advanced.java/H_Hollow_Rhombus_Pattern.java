public class H_Hollow_Rhombus_Pattern {
    public static void Hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            // Printing Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Printing Stars in Hollow Rectangle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Hollow_Rhombus(15);
    }
}
