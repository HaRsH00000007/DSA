public class M_Friends_Pairing {
    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // CHOICE

        // SINGLE
        int fnm1 = friendspairing(n - 1);

        // PAIR
        int fnm2 = friendspairing(n - 2);
        int pairways = fnm1* fnm2;

        // Total Ways
        int totways = fnm1 + pairways;
        return totways;

        // return friendspairing(n-1) + (n-1) * friendspairing(n-2);    Short way to solve
                                                                        // this whole problem
    }

    public static void main(String args[]) {
        System.out.println(friendspairing(3));
    }
}
