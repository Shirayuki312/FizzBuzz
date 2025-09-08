package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int a) {
        int count = 0;
        for (int i = a; i > 0;) {

            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i - 1;
            }
            count ++;
        }
        return count;
    }
}
