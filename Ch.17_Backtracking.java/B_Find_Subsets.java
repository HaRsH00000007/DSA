public class B_Find_Subsets {

    public static void FindSubsets(String str, String ans, int i) {
        // BASE CASE
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // YES CHOICE
        FindSubsets(str, ans + str.charAt(i), i + 1); // Storing value in "ans" which is at ith index

        // NO CHOICE
        FindSubsets(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        FindSubsets(str,"", 0);
    }
}
