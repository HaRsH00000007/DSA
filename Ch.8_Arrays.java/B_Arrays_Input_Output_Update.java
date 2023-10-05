import java.util.*;

public class B_Arrays_Input_Output_Update {
    public static void main(String args[]) {
        int marks[] = new int[100];
        // Length of an Array:
        System.out.println("Length of Array:" + marks.length);

        Scanner sc = new Scanner(System.in);
        // int physics;
        // physics= sc.nextInt();

        System.out.println("Enter your pysics marks: "); // Physics marks
        marks[0] = sc.nextInt();

        System.out.println("Enter your chemistry marks: "); // Chemistry marks
        marks[1] = sc.nextInt();

        System.out.println("Enter your maths marks:"); // Maths marks
        marks[2] = sc.nextInt();

        System.out.println("pysics" + marks[0]);
        System.out.println("chemistry" + marks[1]);
        System.out.println("maths" + marks[2]);

        // Changing marks of a student.
        marks[2] = 100;
        System.out.println("maths" + marks[2]);

        // Updating marks of a student of Maths subject ---->> Addition , Subtraction
        // (Aritmetic Operations) can be done in Arrays .
        marks[2] = marks[2] + 1;
        System.out.println("maths" + marks[2]);

        // Calculating percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage" + percentage + "%");

    }
}
