
public class C_Arrays_as_Fun_Arguments {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
        public static void main(String args[]) {
        int marks[] = { 89, 90, 91 };
        update (marks);

        // Printing our marks.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }

}
