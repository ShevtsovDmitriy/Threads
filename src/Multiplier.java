public class Multiplier implements Runnable {

    private int result;
    private int i, j;
    Matrix matrix;

    public Multiplier(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getResult() {
        return result;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public void run() {
        matrix = Matrix.getInstance();
        int summ = 0;
        for (int k = 0; k < matrix.getMatrix1()[0].length; k++) {
            summ += matrix.getMatrix1()[i][k] * matrix.getMatrix2()[k][j];
        }
        result = summ;
    }
}
