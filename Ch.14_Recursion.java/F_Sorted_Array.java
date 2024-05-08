public class F_Sorted_Array {

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={4,3};
        System.out.println(isSorted(arr,0));
    }
}
