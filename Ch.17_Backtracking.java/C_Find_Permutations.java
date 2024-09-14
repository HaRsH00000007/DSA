public class C_Find_Permutations {
    public static void FindPermutations(String str, String ans){
        // BASE CASE
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);

            // "abcde" --> "ab" + "de" ="abde"
            String Newstr = str.substring(0,i) + str.substring(i+1); // i is not included
            FindPermutations(Newstr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        FindPermutations(str,""); 
    }
}
