public class B_Quick_Sort {
    public static void PrintKaalu(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // RECURSIVE FUN
    public static void QuickSort(int arr[], int si, int ei) {
        // BASE CASE
        if (si >= ei) {
            return;
        }

        // LAST ELEMENT
        int pIdx = partition(arr, si, ei);
        QuickSort(arr, si, pIdx - 1); // LEFT side of pivot index
        QuickSort(arr, pIdx + 1, ei); // RIGHT side of pivot index
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for elements which are smaller than pivot.

        // Analyzing those elements which are smaller than pivot
        for(int j=si ;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                // SWAP
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }

        }
        // Placing pivot at it's correct position.
        i++;
        // SWAP
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;


    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        QuickSort(arr,0,arr.length-1);
        PrintKaalu(arr);
    }
}
