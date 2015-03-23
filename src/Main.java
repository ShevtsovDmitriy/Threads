import java.util.Arrays;

/**
 * Created by Дмитрий on 16.03.2015.
 */
public class Main {

    public static void main(String[] args) {
        MyThread mt = new MyThread(new int[5][7], new int[6][4]);
        mt.go();
        System.out.print(Arrays.deepToString(mt.getResult()));
    }

}
