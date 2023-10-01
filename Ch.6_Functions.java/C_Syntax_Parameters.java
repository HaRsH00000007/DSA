import java.util.*;
public class C_Syntax_Parameters{
    public static int CalculateSum(int num1, int num2){  // num1 and num2 are taken from main function as Parameters or Formal Parameters . ---> Defining statement                   
        int sum= num1 + num2;
        return sum;

    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a  :");
        int a =sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();

        int sum= CalculateSum(a,b);        // Arguments or Actual Parameters (a,b) . ---> Calling Statement

        System.out.println("Sum is:"+sum);
    }
}