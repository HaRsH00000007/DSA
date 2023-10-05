public class H_Uppercase {

    public static String toUpperCase(String str){               // Time Complexity --> Linear Complexity---> O(n).
        StringBuilder sb = new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }

    public static void main(String args[]) {
        String str = "hi, i Am harsh";
        System.out.println(toUpperCase(str));
    }
}
