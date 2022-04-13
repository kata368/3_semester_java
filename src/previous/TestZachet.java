package previous;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;


public class TestZachet {

    public static void main(String args[]) throws Exception {
        readFileExample();
        writeFileExample(readFileExample());

    }

    private static int[] readFileExample() throws Exception {
        Path txt = Path.of("src", "previous/numbers.txt");
        try (Scanner in = new Scanner(txt, StandardCharsets.UTF_8)) {
            int line1 = in.nextInt();
            int[] answer= new int[line1];
            System.out.println(line1);
            int i =0;
            while (in.hasNext()){
                answer[i]=in.nextInt();
                i++;
            }
            System.out.println(Arrays.toString(answer));
            return answer;
        }


    }

    private static void writeFileExample(int [] answer) throws Exception {
        try (PrintStream outFile = new PrintStream("src/finish.txt", StandardCharsets.UTF_8)) {
            int biggest=answer[0];
            for (int i: answer){
                if (biggest<i){
                    biggest=i;
                }
            }
            int space = String.valueOf(biggest).length();
            for (int j : answer) {
                int m = String.valueOf(j).length();
                int addSpace = space - m;
                outFile.println(" ".repeat(addSpace) + j);

            }
            outFile.flush();
        }
    }


}
