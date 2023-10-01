

public class E_Call_By_Value {
    public static void swap(int a, int b) { // Here formal parameters will directly copy values from main function as
                                            // arguments that's why it's known as "Call By Value" .
        // Swap
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String args[]) {
        // Swap -- Value Exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a =" + a);
        System.out.println("b= " + b);
    }
}
