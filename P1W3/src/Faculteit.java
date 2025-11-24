import java.lang.reflect.Array;
import java.util.ArrayList;
import java.math.BigInteger;
public class Faculteit {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + "! --> " + factorial(i));
        }
    }

    // Method to compute factorial using BigInteger for large values
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int j = 2; j <= n; j++) {
            result = result.multiply(BigInteger.valueOf(j));
        }
        return result;
    }
}