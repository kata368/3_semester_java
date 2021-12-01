
import java.util.Arrays;
public class MultidimentionalArrays {
    public static void main(String args[]){
        System.out.println(printTable2(new int[][]{{1,20,40},{50, 7, 900},{50, 9, 888}}));
        printTable_(new int[][]{{2,20,40},{50, 7, 900},{50, 9, 888}});

        printTable1(new int[][]{{3,20,40},{50, 7, 900},{50, 9, 888}});
        printTableAligned(new int[][]{{3,20,40},{50, 7, 900},{50, 9, 888,4444}});


        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    public static String printTable2(int[][] a){
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

    public static void printTable1(int[][] a){
        String lines = "";
        for (int[] line : a){
            for (int x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
            lines= "";
        }
    }

    public static void printTableAligned(int[][] a){
        String line="";
        int max = 0;
        String dlina ="";
        for (int [] array :a) {
            if (array.length> max){
                max=array.length;
            }
        }
        int [] newArray= new int[max];



    }

    public static char[][] createTable(int a, char divider){
        char[][] answer = new char[a][a];
        for (char[] x : answer){
            for (int i = 0; i<x.length; i++){
                x[i]=divider;
            }
        }
        return answer;

    }

    public static void printTable(char[][] a){
        String lines = "";
        for (char[] line : a){
            for (char x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
            lines= "";
        }
    }

    public static void fillFirstAndLastLines(char[][] c, char frame){
        Arrays.fill(c[0], frame);
        Arrays.fill(c[c.length -1], frame);

    }

    public static void fillFirstAndLastColumns(char [][] c, char frame){
        for (char[] x: c){
            x[0]=frame;
            x[c.length-1]=frame;

        }
    }
}
