// Calculator.java
public class Calculator {

    public int add(int x, int y) {
        if (x >= 0 && y >= 0) {
            return x + y;
        } else {
            return 0;
        }
    }

    public int minus(int x, int y) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x - y;
    }

    public int example(int x, int y, int z) {
        int result = 0;
//        if (x >= 3 && y == 0) {
        if (x >= 3 || y == 0) {
            result = z + x;
        }
        if (z <= 5 || x < z) {
            result = result + x;
        } else {
            result = result + y;
        }
        return result;
    }
}
