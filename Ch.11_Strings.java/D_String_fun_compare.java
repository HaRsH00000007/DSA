public class D_String_fun_compare {
    public static void main(String args[]){
        String s1="Harsh";
        String s2="Harsh";
        String s3=new String("Harsh");

        /*if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }*/

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}