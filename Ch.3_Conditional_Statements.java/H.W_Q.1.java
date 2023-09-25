import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number coder:");
        int num = sc.nextInt();

        
        // Using Ternary Operator:
        String type=(num>0? "Positive" : "Negative");
        System.out.println(type);
        
        }
}