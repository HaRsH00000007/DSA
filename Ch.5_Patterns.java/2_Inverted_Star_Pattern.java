import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        int n=10;

        // Outer Loop.
        for(int line=1;line<=n;line++){

            // Inner Loop ( Printing Stars ).
            for(int star=1;star<=line;star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}