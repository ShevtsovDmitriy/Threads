public class MyThread {

    private Multiplier[] multipliers; // = new Multiplier[Runtime.getRuntime().availableProcessors()];

    private int[][] matrix1, matrix2;

    public MyThread(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public void go(){
        if (matrix1.length != matrix2[0].length)
        {
            System.out.print("Размеры матриц заданы неверно");
        }
        else
        {
            int size = matrix1.length * matrix2[0].length;
            int currentThread = 0;
            multipliers = new Multiplier[size];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    multipliers[currentThread] = new Multiplier(i, j);
                }
            }
        }
    }

    public int[][] getResult(){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (Multiplier multiplier : multipliers) {
            result[multiplier.i][multiplier.j] = multiplier.getResult();
        }
        return result;
    }




}
