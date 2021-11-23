// Main.java
package experiment5;

public class Main {

    public float commission(int headphones, int shells, int protectors) {
        float salary;
        float total;
        if (headphones <= 0 || shells < 0 || protectors < 0) {
            return (float) -1;
        }
        total = headphones * 80 + shells * 10 + protectors * 8;
        if (total < 1000) {
            salary = total * (float) 0.1;
        } else if (total < 1800) {
            salary = 1000 * (float) 0.1 + (total - 1000) * (float) 0.15;
        } else {
            salary = 1000 * (float) 0.1 + (800) * (float) 0.15 + (total - 1800) * (float) 0.2;
        }
        return salary;
    }

}
