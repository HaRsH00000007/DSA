public class C_Sorted_Rotated_array {
    public static int search(int arr[], int target, int si, int ei) {

        // BASE CASE
        if(si>ei){
            return -1;
        }
        // KAAM
        int mid = si + (ei - si) / 2; // (si+ei)/2

        // CASE FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // mid lies on L1
        if (arr[si] <= arr[mid]) {
            // CASE a: Left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid);
            } else {
                // CASE b: Right
                return search(arr,target,mid+1,ei);
            }
        }

        //mid Lies on L2
        if (arr[mid]<= target && target<=arr[ei]){
            // CASE c: Right
            return search(arr,target,mid+1,ei);
        }else{
            // CASE d: Left
            return search(arr,target,si,mid-1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output will be index value = 4.
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
