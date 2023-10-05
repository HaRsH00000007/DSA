public class G_String_Builder {
    public static void main(String args[]){             // Time Complexity --> O(n)
        StringBuilder Sb=new StringBuilder("");

        for(char ch='a';ch<='z';ch++){
            Sb.append(ch);
        }
        System.out.println(Sb.length());
    }

}
