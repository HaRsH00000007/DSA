public class J_Fun_Overload_Datatypes {
    // Function overloading using different datatypes.

    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(8,7));
        System.out.println(sum(6.4f,9.5f));
    }
}
