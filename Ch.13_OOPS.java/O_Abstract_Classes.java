public class O_Abstract_Classes {
    public static void main(String args[]) {
        Horse Kaalu = new Horse();
        Kaalu.eat();
        Kaalu.walks();
        System.out.println(Kaalu.color);

        Chicken Chuuza = new Chicken();
        Chuuza.eat();
        Chuuza.walks();
        System.out.println(Chuuza.color);

    }
}

abstract class Animals {

    String color;

    Animals() {
        color = "brown";
    }

    // Non - Abstract Method
    void eat() {                               // The use of eat() function depends upon animal class.
        System.out.println("eats everyone");
    }

    // Abstract Method
    abstract void walks(); // Abstraction gives an idea that there is a function named walk in Animal class
                           // which is used by other classes in their own way , The use of walk() fun.
                           // doesn't depend upon Animal class.
}

class Horse extends Animals {
    void changecolor(){
        color="DarkBrown";
    }

    void walks() {
        System.out.println("A Horse walks on 4 legs");
    }
}

class Chicken extends Animals {
    void changecolor(){
        color="white";
    }
    void walks() {
        System.out.println("A Chicken walks on 2 legs");
    }
}
