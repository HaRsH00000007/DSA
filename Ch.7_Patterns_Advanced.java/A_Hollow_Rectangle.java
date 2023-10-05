public class A_Hollow_Rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        // Outer Loop ---> Rows
        for (int i = 1; i <= totRows; i++) {

            // inner loop ---> Columns
            for (int j = 1; j <= totCols; j++) {

                // Cells(i,j) ---> Printing condition to find outer row or outer column.
                if (i == 1 || i == totRows || j == 1 || j == totCols) {

                    // Printing Boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(10,8);
    }

}
