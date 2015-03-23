public class Matrix {
    private static Matrix ourInstance = new Matrix();

    public static Matrix getInstance() {
        return ourInstance;
    }

    private Matrix() {
    }

    private int[][] matrix1, matrix2;

    public void setMatrix(int[][] matrix1, int[][] matrix2){
        if (this.matrix1 == null){
            this.matrix1 = matrix1;
            this.matrix2 = matrix2;
        }
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }
}
