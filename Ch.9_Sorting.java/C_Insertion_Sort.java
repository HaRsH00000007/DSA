public class C_Insertion_Sort {

    public static void insertionsort(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            int curr=ar[i];
            int prev=i-1;
            // Finding out the correct position to insert.
            while(prev>=0 && ar[prev]>curr){
                ar[prev+1]=ar[prev];
                prev--;
            }
            // Insertion
            ar[prev+1]=curr;
        }
    }

    public static void printAr(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        int ar[]={5,4,1,3,2};
        insertionsort(ar);
        printAr(ar);
    
    }
}
