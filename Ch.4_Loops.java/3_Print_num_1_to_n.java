import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n :");
        int range = sc.nextInt();
        int counter=1;

        while (counter<=range){
            System.out.print(counter+ "  ");
            counter++;

        }

        System.out.println();
    }
}