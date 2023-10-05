public class L_Max_SubArray_Kadanes_Sum {
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;                                                       // cs --> current sum

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs<0){        // Means  for negative numbers current sum will be zero .
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(" Our max Sub Array Sum is:" +ms);

    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
