import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        int marks = sc.nextInt();
        

        /*if (marks>=33){
            System.out.println("Student is PASS");
        }
        else{
            System.out.println("Student is FAIL");
        }*/

        
        // Using Ternary Operator:
        String ReportCard=marks>=33? "PASS" : "FAIL" ;
        System.out.println(ReportCard);
    }
}