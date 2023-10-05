public class B_Selection_Sort {
    public static void selectionsort(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            int minpos = i;     // minpos --> Min. element at current position.
            for(int j=i+1; j<ar.length ;j++){
                if(ar[minpos]>ar[j]){
                    minpos=j;

            }
        }
        // SWAP
        int temp=ar[minpos];
        ar [minpos]=ar[i];
        ar[i]=temp;
    }
}

    public static void printAr(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]={5,4,1,3,2};
        selectionsort(ar);
        printAr(ar);

    }
}
