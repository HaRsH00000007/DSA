public class I_Multi_Level_Inheritance {
    public static void main(String args[]){
        Dog Sheero=new Dog();
        Sheero.eat();
        Sheero.legs=9;
        System.out.println(Sheero.legs);
        Sheero.breed="German Shepherd";
        System.out.println(Sheero.breed);
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
    int legs;
}

class Dog extends Mammals {
    String breed;
}