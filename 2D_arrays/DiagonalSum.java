public class DiagonalSum {
    //optimised solution O(n)
    public static void sumDiag(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
            if(i == matrix[i].length-1-i){
                continue;
            }
            sum+=matrix[i][i] +matrix[i][matrix[i].length-1-i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sumDiag(matrix);
    }
}
