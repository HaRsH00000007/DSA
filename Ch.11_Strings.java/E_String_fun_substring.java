public class E_String_fun_substring {

    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Helloworld";
        System.out.print(str.substring(0,5));
        //System.out.println(substring(str,3,5));
    }
}
