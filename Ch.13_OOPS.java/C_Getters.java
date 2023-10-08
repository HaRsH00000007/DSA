public class C_Getters {
    public static void main(String args[]) {
        Pen p1=new Pen(); // Created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    // Getters
    String getColor() {
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // Setters
    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int Tip){
        this.tip=Tip;
    }
}
