public class F_Butterfly_Pattern {
    public static void butterfly(int n) {

        // 1st Half

        for (int i = 1; i <= n; i++) {
            // Inner Loop

            // 1st ---> Print Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2nd ---> Print Spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3rd ---> Print Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half ---> Mirror Image of 1st Pattern.

        for (int i = n; i >= 1; i--) {
            // Inner Loop

            // 1st ---> Print Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2nd ---> Print Spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3rd ---> Print Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterfly(10);
    }
}
