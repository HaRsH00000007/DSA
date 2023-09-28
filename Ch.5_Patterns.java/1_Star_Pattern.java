import java.util.*;
public class Java_Basics{
    public static void main(String args[]){

        // Outer Loop.
        for(int line=1; line<=10;line++){

            // Inner Loop.
            for(int star=1; star<=line;star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}