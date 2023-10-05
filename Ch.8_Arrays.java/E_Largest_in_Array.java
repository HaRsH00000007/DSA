
public class E_Largest_in_Array {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;        // MIN_VALUE-->> -Infinity   --> For finding Largest
        int smallest = Integer.MAX_VALUE;       // MAX_VALUE--->> +Infinity  --> For finding Smallest


        for(int i=0;i<numbers.length;i++){

            if(largest<numbers[i]){
                largest=numbers[i];
            }

            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }

        System.out.println("Smallest Value is:"+ smallest);
        return largest;

    }

    public static void main(String args[]) {
        int numbers[] = { 2,4,6,8,10 };
        System.out.println("largest value is: " + getLargest(numbers));

    }

}
