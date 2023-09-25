import java.util.*;
public class A_if_else{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();

        if (age>=18){
            System.out.println("Adult :Drive College Vote");
        }

        if (age>13 && age<18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Not Adult");
        }
    }
}