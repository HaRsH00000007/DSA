public class I_Print_SubArrays {
    public static void printSubArrays(int numbers[]){
        
        int ts=0;
        for(int i=0; i<=numbers.length; i++){           // Calculating Start.
            int start = i;

            for (int j=i; j<numbers.length; j++){       // Calculating End.
                int end= j;

                for(int k=start ;k<=end;k++){           // Printing Sub_Arrays.
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total Sub Arrays: "+ ts);
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);

    }
}
