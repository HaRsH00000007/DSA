import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks buddy :");
        int marks=sc.nextInt();

        String RC=marks>=33?"PASS":"FAIL";
        System.out.println(RC);
    }
}