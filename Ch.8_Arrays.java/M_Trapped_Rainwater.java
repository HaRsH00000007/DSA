public class M_Trapped_Rainwater {
    public static int TrappedRainWater(int ht[]) {  // Time Complexity --> (o)n
        int n = ht.length;

        // Calculating Left Maximum Boundary --> Array

        int leftMax[] = new int[n];
        leftMax[0] = ht[0];
        for (int i = 1; i < ht.length; i++) {
            leftMax[i] = Math.max(ht[i], leftMax[i - 1]);
        }

        // Calculating Right Maximum Boundary --> Array

        int rightMax[] = new int[n];
        rightMax[n - 1] = ht[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(ht[i], rightMax[i + 1]);
        }

        int trappedwater=0;
        // Loop
        for(int i=0; i<n; i++){
            // WaterLevel = min(leftMax bound, rightMax bound)
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
            // Trapped Water = WaterLevel - ht[i]
            trappedwater = trappedwater+(WaterLevel-ht[i]);
        }
        return trappedwater;

    }

    public static void main(String args[]) {
        int ht[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedRainWater(ht));

    }
}
