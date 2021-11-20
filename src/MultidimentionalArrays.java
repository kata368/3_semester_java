import java.util.Arrays;
public class MultidimentionalArrays {
    public static void main(String args[]){
        System.out.println(printTable(new int[][]{{1,20,40},{50, 7, 900},{50, 9, 888}}));
        printTable_(new int[][]{{1,20,40},{50, 7, 900},{50, 9, 888}});
        printTableAligned(new int[][]{{1,20,40},{50, 7, 900},{50, 9, 888}});

    }

    public static String printTable(int[][] a){
        String forPrintTable="";
        for (int[] ints : a) {
            forPrintTable += Arrays.toString(ints) + "\n";
        }
        return forPrintTable;
    }

    public static void printTable_(int[][] a){
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public static void printTableAligned(int[][] a){
        String m="";
        for (int i=0; i < a.length; i++) {
            System.out.println("%d %d".formatted(m, a[i]));
        }
    }
}
