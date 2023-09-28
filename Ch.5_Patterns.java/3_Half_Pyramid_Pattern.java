import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        int n=11;

        // Outer Loop.
        for(int line=1 ; line<=n; line++){
            // Printing numbers:
            for(int num=1; num<=line; num++){
                System.out.print(num);
                
            }
            System.out.println( ); // To change line.
        }
    }
}