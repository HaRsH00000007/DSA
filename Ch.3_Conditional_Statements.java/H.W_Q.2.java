import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        double temp=103.5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your temperature buddy: ");
        int temperature= sc.nextInt();

        if(temperature>temp){
            System.out.println("You have fever buddy. Take care of yourself, buddy! life is hard ,stay strong. ");
        }
        else{
            System.out.println("You are okay enjor your life.");
        }
        
        
    }
}