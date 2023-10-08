public class L_Method_Overloading {
    public static void main(String args[]){
        Calculator ScientificCalc=new Calculator();
        System.out.println(ScientificCalc.sum(1,2));
        System.out.println(ScientificCalc.sum((float)1.2,(float)2.3));
        System.out.println(ScientificCalc.sum(4,6,7));
        System.out.println(ScientificCalc.product(5,6));
        System.out.println(ScientificCalc.product((float)5.3,(float)2.6));

    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int product(int a,int b){
        return a*b;
    }
    float product(float a,float b){
        return a*b;
    }
}
