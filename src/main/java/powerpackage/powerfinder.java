package powerpackage;

public class powerfinder {
    public static int power(int base, int exponent) {
        int res = 1;

        for (int itr=0; itr<exponent; itr++) {
            res *= base;
        }

        return res;
    }
}
