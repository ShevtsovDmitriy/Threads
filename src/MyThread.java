public class MyThread {

    private Multiplier[] multipliers; // = new Multiplier[Runtime.getRuntime().availableProcessors()];

    public MyThread(int[][] matrix1, int[][] matrix2) {
        Matrix.getInstance().setMatrix(matrix1, matrix2);
    }

    public void go(){
        if (Matrix.getInstance().getMatrix1()[0].length != Matrix.getInstance().getMatrix2().length)
        {
            System.out.print("Размеры матриц заданы неверно");
        }
        else
        {
            int size = Matrix.getInstance().getMatrix1().length * Matrix.getInstance().getMatrix2()[0].length;
            int currentThread = 0;
            multipliers = new Multiplier[size];
            for (int i = 0; i < Matrix.getInstance().getMatrix1().length; i++) {
                for (int j = 0; j < Matrix.getInstance().getMatrix2()[i].length; j++) {
                    multipliers[currentThread] = new Multiplier(i, j);
                    multipliers[currentThread++].run();
                }
            }
        }
    }

    public int[][] getResult(){
        int[][] result = new int[Matrix.getInstance().getMatrix1().length][Matrix.getInstance().getMatrix2()[0].length];
        for (Multiplier multiplier : multipliers) {
            result[multiplier.getI()][multiplier.getJ()] = multiplier.getResult();
        }
        return result;
    }




}
