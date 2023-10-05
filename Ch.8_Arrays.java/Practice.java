public class Practice {
    public static void kadanes(int ar[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < ar.length; i++) {
        
            if (cs < 0) {
                ms = Math.max(cs,ms);
            }

        }
        System.out.println(ms);

    }

    public static void main(String args[]) {
        int ar[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(ar);

    }
}