import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
    public static void main(String args[]) {
        forPrinting(sieveOfEratosthenes(5));
        forPrinting(sieveOfEratosthenes(10));

        System.out.println(primes(5));
        System.out.println(primes(10));

    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] forBooleans = new boolean[n + 1];
        Arrays.fill(forBooleans, true);
        forBooleans[0] = false;
        forBooleans[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (forBooleans[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    forBooleans[j] = false;
                }
            }
        }
        return forBooleans;
    }

    public static void forPrinting(boolean[] forPrint) {
        System.out.println(Arrays.toString(forPrint));
    }

    public static List<Integer> primes(int n) {
        boolean[] forBooleans = new boolean[n+1];
        Arrays.fill(forBooleans, true);
        forBooleans[0] = false;
        forBooleans[1] = false;
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i * i <= n; i++) {
            if (forBooleans[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    forBooleans[j] = false;
                }
            }
        }
        for (int i =0; i<forBooleans.length; i++){
            if (forBooleans[i]){
                numbers.add(i);
            }

        }
        return numbers;
    }




}







