public class B_Palindrome {
    public static boolean palindrome(String str) {          // Time Complexity --> Linear Time O(n).
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;

            }
        }
        return true;

    }

    public static void main(String args[]) {
        String str = "noon";

        System.out.println(palindrome(str));

    }
}