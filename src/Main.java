import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[][] m1 = new int[3][4];
        int[][] m2 = new int[4][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = rnd.nextInt(10);
            }
        }
        MyThread mt = new MyThread(m1, m2);
        mt.go();
        System.out.print(Arrays.deepToString(mt.getResult()));
    }

}
