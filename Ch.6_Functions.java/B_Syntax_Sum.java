import java.util.*;
public class B_Syntax_Sum{
    public static void CalculateSum(){
        // Body of our Function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();

        System.out.println("Enter b:");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("Sum is :"+sum);

    }

    public static void main(String args[]){
        CalculateSum();         // -----> Calling Function
    }
}