import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        int n=7;
        char ch='A';

        // Outer Loop.
        for(int line=1; line<=n; line++){
            
            // Printing characters.
            for( int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}