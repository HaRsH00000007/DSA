public class practice {
    public static void hollow_rectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        hollow_rectangle(5,3);
    }
}
