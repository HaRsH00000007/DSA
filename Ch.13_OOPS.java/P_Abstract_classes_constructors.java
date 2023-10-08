public class P_Abstract_classes_constructors {
    public static void main(String args[]){
        Mustang MyHorse= new Mustang();
        // Animal --> Horse --> Mustang
    }
}

abstract class Animals {
    Animals(){
        System.out.println("Animals constructor is being called");
    }

    String color;

    // Non - Abstract Method
    void eat() { // The use of eat() function depends upon animal class.
        System.out.println("eats everyone");
    }

    // Abstract Method
    abstract void walks(); // Abstraction gives an idea that there is a function named walk in Animal class
                           // which is used by other classes in their own way , The use of walk() fun.
                           // doesn't depend upon Animal class.
}

class Horse extends Animals {
    Horse() {
        System.out.println("Horse constructor is being called");
    }

    void changecolor() {
        color = "DarkBrown";
    }

    void walks() {
        System.out.println("A Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is being called.");
    }
}

class Chicken extends Animals {
    void changecolor() {
        color = "white";
    }

    void walks() {
        System.out.println("A Chicken walks on 2 legs");
    }
}
