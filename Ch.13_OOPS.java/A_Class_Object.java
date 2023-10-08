public class A_Class_Object {

    public static void main(String args[]){

        Pen p1= new Pen(); //Created a pen object called p1.
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        student s1=new student();
        s1.setage(20);
        System.out.println(s1.age);
    }
}

    class Pen {
        String color;
        int tip;

        void setcolor(String newcolor) {
            color = newcolor;
        }

        void setTip(int newtip) {
            tip = newtip;
        }

    }

    class student {
        String name;
        int age;
        float percentage;

        void setage(int newage){
            age=newage;
        }

        void calcpercentage(int maths,int physics,int chem){
            percentage = (physics+chem+maths)/3;
        }

    }
