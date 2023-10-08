public class S_Static_Keyword {
    public static void main(String args[]){
        Student s1=new Student();
        s1.SchoolName="Kendriya Vidyalaya School";

        Student s2=new Student();
        System.out.println(s2.SchoolName);
    }
}

class Student{
    String name;
    int Roll;

    static int percentage(int math,int sci,int polity){
        return (math+sci+polity)/3;
    }

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}