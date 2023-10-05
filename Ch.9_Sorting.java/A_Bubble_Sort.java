public class A_Bubble_Sort{
    public static void BubbleSort(int ar[]){
        for(int turn=0;turn<ar.length-1;turn++){
            for(int j=0;j<ar.length-1-turn;j++){
                if (ar[j]>ar[j+1]){
                    // SWAP
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
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
        BubbleSort(ar);
        printAr(ar);
    }
}