public class G_Shallow_Deep {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.roll = 456;
        s1.password = "xyz";
        s1.marks[0] = 90;
        s1.marks[1] = 34;
        s1.marks[2] = 45;

        Student s2 = new Student(s1); // Copying here in this single statement.

        s1.marks[0] = 99; // Changing marks of 1st student which will automatically reflect in marks of
                          // 2nd student.

        s2.password = "abcd";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructor
    // Copy Constructor
    //Student(Student s1) {
        //this.name = s1.name;
        //this.roll = s1.roll;
        //this.marks = s1.marks;
    //}

    // Deep Copy Constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("dsbvfjaGDVU");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}