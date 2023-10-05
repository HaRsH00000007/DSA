import java.util.*;

public class A_Input_Output {

    // Printing all Letters in a String.
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();

    }

    public static void main(String args[]) {
        
        /*
         * char arr[]={'a','b','c','d'};
         * 
         * String str = "abcd";
         * String str2 = new String( "xyz");
         * 
         * // Strings are IMMUTABLE .
         * 
         * Scanner sc = new Scanner(System.in);
         * String name;
         * //name=sc.next();
         * name = sc.nextLine();
         * System.out.println(name);   */

        /*
         * String fullName = "Tony kakkar";
         * System.out.println ("Length of string is: "+fullName.length());
         */



        // Concatenation of Strings
        String firstname = "Harsh";
        String lastname = "Singh";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // To check letter at specific place in a string.
        System.out.println(fullname.charAt(4));


        printLetters(fullname);

    }

}