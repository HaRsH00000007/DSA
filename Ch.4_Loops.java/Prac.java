import java.util.*;
public class Prac{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your n buddy: ");
        int n=sc.nextInt();

        if(n==2){
            System.out.print("n is a prime number: ");
        }
        
        else{
            boolean isPrime= true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            
            }
            if(isPrime==true){
                System.out.println("+Given no. is a prime number");
            }
            else{
                System.out.println("+Given number is not a prime number");
            }
             
        }
    }
}