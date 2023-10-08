public class E_Types_Constructors {
    public static void main(String args[]){
        Student s1=new Student();
     

        Student s2=new Student("Harsh");
        

        Student s3=new Student(567);
       
        
    }
}

class Student{
    int roll;
    String name;

    // Non-Parametrized Constructor
    Student(){
        System.out.println("Constructors are being called...");
    }

    // Parameterized Constructor
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }

}
