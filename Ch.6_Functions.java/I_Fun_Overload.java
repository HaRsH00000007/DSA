public class I_Fun_Overload {

    // Function overloading  depends upon no. of parameters .

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(9,5));

        System.out.println(sum(9,4,1));

    }
    
}
