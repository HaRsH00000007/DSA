public class K_Tiling_problem {
    public static int tilingproblem(int n) { // 2 x n Floor Size
        // Base Case
        if(n==0 || n==1){
            return 1;
        }
        // Kaam

        // Vertical Choice
        int fnm1=tilingproblem(n-1);

        // Horizontal Choice
        int fnm2=tilingproblem(n-2);

        int totalways= fnm1 + fnm2;
        return totalways;
    }

    public static void main(String args[]){
        System.out.println(tilingproblem(4));
    }
}
