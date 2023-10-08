public class J_Hierarchial_Inheritance{
    public static void main(String args[]){
        Fish Cookie=new Fish();
        Cookie.swim();
        Cookie.eat();

    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animals {
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animals{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Flies away");
    }
}

