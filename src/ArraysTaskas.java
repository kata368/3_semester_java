import java.util.Arrays;

public class ArraysTaskas {
    public static void main(String args[]) {
        System.out.println(even(4));
        System.out.println(even(1));
        System.out.println(even(0));

        System.out.println(allSimilar(new int[]{10, 10, 10}));
        System.out.println(allSimilar(new int[]{1, 2, 3}));
        System.out.println(allSimilar(new int[]{155, 2, 73}));
        System.out.println(allSimilar(new int[]{696, 696, 696, 696}));

        System.out.println(hasSimilar(new int[]{15, 50, 77, 14}));
        System.out.println(hasSimilar(new int[]{14, 50, 77, 14}));

        System.out.println(mean(new int[]{5, 10, 15}));
        System.out.println(mean(new int[]{2, 4, 6}));
        System.out.println(mean(new int[]{87, 15, 71}));
    }

    public static String even(int n) {
        int[] list_of_numbers = new int[n];
        int forNumber = 0;
        for (int x = 0; x < n; x++) {
            forNumber += 2;
            list_of_numbers[x] = forNumber;
        }
        return Arrays.toString(list_of_numbers);

    }

    public static boolean allSimilar(int[] forWork) {
        int forAnswer = 0;
        for (int i : forWork) {
            if (forWork[0] != i) {
                forAnswer++;
            }
        }
        return forAnswer == 0;
    }

    public static boolean hasSimilar(int[] forHasSimilar) {
        int answer = 0;
        for (int i : forHasSimilar) {
            for (int j : forHasSimilar) {
                if (i == j) {
                    answer++;
                }
            }
        }
        return answer > 0;
    }

    public static double mean(int[] forMean) {
        int sum = 0;
        for (int i : forMean) {
            sum += i;
        }
        return ((double)sum) / forMean.length;

    }
}// hasSimilar сравнивиет самого с собой, не знаю, как исправить...


