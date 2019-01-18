package desmond.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
        long number = 600_851_475_143L;
        List<Long> factors = new ArrayList<>();
        
        long factor = 0;
        do {
            factor = getSmallestPrimeFactor(number);
            factors.add(factor);
            number = number / factor;
        } while (number != 1);
        Collections.sort(factors);
        System.out.println(factors.get(factors.size() - 1));
    }

    private static long getSmallestPrimeFactor(long number) {
        for (long i = 2; i <= number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        throw new RuntimeException();
    }

}
