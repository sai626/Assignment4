package Assignment4;

import java.util.Random;

/**
 * Created by zemoso on 3/7/17.
 */
public class Main {

    public void throwException(int i) throws Exception_1, Exception_2, Exception_3 {
        switch (i) {
            case 0:
                throw new Exception_1("Exception_1");
            case 1:
                throw new Exception_2("Exception_2");
            case 2:
                throw new Exception_3("Exception_3");

        }
    }

    public static void main(String args[]) {

        Main m = new Main();
        Random r = new Random(System.currentTimeMillis());

        try {

            int i = r.nextInt(4);
            if (i == 3) {
                throw new NullPointerException("NullPointerException");
            } else {
                m.throwException(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("From finally clause");
        }
    }
}
