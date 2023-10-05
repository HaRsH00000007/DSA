
public class F_Binary_Search {
    public static int binarySearch(int numbers[], int key){
        int start=0,end=numbers.length-1;
        
        while( start <= end ){
            int mid = (start+end)/2;

            // Comparisons:
            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]<key){   // Right
                start = mid + 1;
            }
            else{
                end = mid - 1;      // Left
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 10, 23, 25 };
        int key = 10;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}
