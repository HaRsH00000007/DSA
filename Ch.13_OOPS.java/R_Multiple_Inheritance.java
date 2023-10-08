public class R_Multiple_Inheritance {
    public static void main(String args[]){
        Bear Nikhil=new Bear();
        Nikhil.eats();
        Nikhil.walks();
    }
}

interface Herbivore{
    void eats();
    void walks();

}

interface Carnivore{
    void eats();
}

class Bear implements Herbivore,Carnivore{
    
    public void eats(){
        System.out.println("Bear eats veg as well as non veg");
    }
    public void walks(){
        System.out.println("Bear walks on 4 legs.");
    }
}
