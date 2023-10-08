public class M_Method_Overriding {
    public static void main(String args[]){
        Deer Dobby=new Deer();
        Dobby.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats only grass");
    }

}
