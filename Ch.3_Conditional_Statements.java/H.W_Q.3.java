import java.util.*;
public class Java_Basics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week number : ");
        int day= sc.nextInt();

        switch(day){
            case 1: System.out.println("Monday");
                        break;
            case 2: System.out.println("Tuesday");
                        break;
            case 3: System.out.println("Wednesday");
                        break;
            case 4: System.out.println("Thursday");
                        break;
            case 5: System.out.println("Friday");
                        break;
            case 6: System.out.println("Saturday");
                        break;
            default: System.out.println("Sunday");
        }
    }
}