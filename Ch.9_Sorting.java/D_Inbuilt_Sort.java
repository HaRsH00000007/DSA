import java.util.Collections;
public class D_Inbuilt_Sort{

    public static void printAr(Integer ar[]){
        for(int i=0; i<ar.length ;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    
    }
    
    public static void main(String args[]){
    Integer ar[]={5,4,3,2,1};

    //Arrays.sort(ar); --> To print array in sorted way

    //Arrays.sort(ar,0,3); --> To print array in sorted way from (si) starting index to (ei) ending index.

    Arrays.sort(ar,Collections.reverseOrder());
    printAr(ar);

}

}