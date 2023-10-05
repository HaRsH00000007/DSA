
// Reverse an Array.

public class G_Reverse_an_Array {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // Swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        // Printing our Array.
        reverse(numbers);
        for (int i = 0; i <= numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

}
