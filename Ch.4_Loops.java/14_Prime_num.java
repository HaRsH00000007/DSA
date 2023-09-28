// Calculating whether the given num is prime or not?

import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n buddy ");
        int n = sc.nextInt();

        if (n==2){
            System.out.println("n is Prime number.");
        }

        else{
            boolean isPrime =true;
            for (int i=2;i<=n-1;i++){
                if(n%i==0){  // n is a multiple of i (i is not equal to 1 or n .)
                    isPrime = false;
                }
            }

            if(isPrime ==true){
                System.out.println(" +n is a Prime number");
            }   
            else{
                System.out.println(" +n is not a Prime number");
            }
        }

    }
}
