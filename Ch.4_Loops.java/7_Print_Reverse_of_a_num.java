import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        while(n>0){
            int Lastdigit = n%10;
            System.out.print(Lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}