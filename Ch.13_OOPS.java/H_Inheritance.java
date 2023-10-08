public class H_Inheritance {
    public static void main(String args[]){
    Fish shark=new Fish();
    shark.eat();
    }
}

// Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived Class / Subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}
