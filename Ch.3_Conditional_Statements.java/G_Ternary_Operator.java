import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        // Ternary Operator.
        String type=((num % 2)==0 ) ? "Even" : "Odd" ;
        System.out.println(type);

    }
}