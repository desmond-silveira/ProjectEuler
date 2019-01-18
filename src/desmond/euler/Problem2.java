package desmond.euler;

public class Problem2 {

    public static void main(String[] args) {

        int sum = 2;

        int i = 0;
        int j = 1;
        int current = 2;
        do {
            i = j;
            j = current;        
            current = i + j;
            if (current % 2 == 0) {
                sum += current;
            }
        } while (current < 4_000_000);
        System.out.println(sum);
    }
}
