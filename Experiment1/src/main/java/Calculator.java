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

}
