public class C_Inverted_Half_Pyramid_Numbers {
    public static void inverted_half_pyramid_with_numbers(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop for printing numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }

    public static void main(String args[]){
        inverted_half_pyramid_with_numbers(12);
    }
}
