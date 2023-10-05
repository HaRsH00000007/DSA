public class C_Diagonal_Sum{
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        /*for(int i=0;i<matrix.length;i++){         // Complexity is O(n^2) --> Brute force
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }

                // Printing Secondary Diagonal
                else if(i+j ==matrix.length-1){
                    sum=sum+matrix[i][j];

                }
            }
        }*/

        for(int i=0;i<matrix.length;i++){       // Complexity is O(n)
            // pd
            sum = sum+matrix[i][i];

            // sd
            if(i!=matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println("Sum of diagonal elements is: "+diagonalsum(matrix));
    }

}