// public class A_Backtracking_on_arrays {
//     public static void ChangeArr(int arr[], int i, int val) {
//         // BaSE CASE
//         if (i == arr.length) {
//             printArr(arr);
//             return;
//         }
//         // KAAM
//         arr[i] = val;
//         ChangeArr(arr, i + 1, val + 1);
//         arr[i] = arr[i] - 2;
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = new int[5];
//         ChangeArr(arr, 0, 1);
//         printArr(arr);

//     }
// }

public class A_Backtracking_on_arrays{
    public static void changeArr(int[] arr, int i, int val) {
        // B A S E C A S E
        if (i == arr.length) {
            printArr(arr);
            return;
        }
    
    
        // K A A M
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
        
    
    
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
    }


