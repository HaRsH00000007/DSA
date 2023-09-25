import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a =sc.nextInt();

        System.out.println("Enter b:");
        int b= sc.nextInt();

        System.out.println("Enter c:");
        int c= sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is largest of them all");
        }
        else if(b>=c){
            System.out.println("b is largest of them all");
        }
        else{
            System.out.println("c is largest of them all");
        }
    }
}