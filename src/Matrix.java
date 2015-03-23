import java.util.Arrays;

public class Matrix {
    private static Matrix ourInstance = new Matrix();

    public static Matrix getInstance() {
        return ourInstance;
    }

    private Matrix() {
    }

    private int[][] matrix1, matrix2;

    public void setMatrix(int[][] matrix1, int[][] matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        System.out.print(Arrays.deepToString(matrix1) + "\n");
        System.out.print(Arrays.deepToString(matrix2) + "\n");
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }
}
