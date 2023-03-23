package CodeWars.src.snail_sort;

public class Snail {
    /**
     * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
     *
     * array = [[1,2,3],
     *          [4,5,6],
     *          [7,8,9]]
     * snail(array) #=> [1,2,3,6,9,8,7,4,5]
     *
     * Other solutions: https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/solutions/java
     */
    public static int[] snail(int[][] array) {
        if (array==null) return null;

        int n = array.length;
        if (n==1) return array[0];

        int snail[]= new int[n*n];
        int cont=-1;
        // first row
        for (int i=0, j = 0; j < n; j++) {
            snail[++cont]=array[i][j];
        }
        if (n==1) return snail;
        // last column
        for (int i=1, j = n-1; i<n ; i++) {
            snail[++cont]=array[i][j];
        }
        // last row
        for (int i=n-1, j = n-2; j>=0 ; j--) {
            snail[++cont]=array[i][j];
        }
        // first column
        for (int i=n-2, j = 0; i>0 ; i--) {
            snail[++cont]=array[i][j];
        }
        if (n==3){
            snail[++cont]=array[1][1];
        } else if(n>3){
            int[][] arrayloop= new int[n-2][n-2];
            for (int i = 1; i < n-1; i++) {
                for (int j = 1; j < n-1; j++) {
                    arrayloop[i-1][j-1]=array[i][j];
                }
            }
            // recursive call
            int[] snail2= snail(arrayloop);
            for (int i = 0; i < snail2.length; i++) {
                snail[++cont]=snail2[i];
            }
        }
        return snail;
    }
}
