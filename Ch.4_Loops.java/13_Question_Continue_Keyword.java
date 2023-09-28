// Q > Display all numbers entered by user except multiples of 10.
import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number buddy :");
            int n=sc.nextInt();

            if(n%10 ==0){
                continue;
            }

            System.out.println("Your number is " + n);

        }
        while(true);
    }
}