public class introTasks {
    public static void main(String args[]) {
        System.out.println(Task3Digits(50));
        System.out.println(Task3Digits(120));
        System.out.println(Task3Digits(1500));

        System.out.println(IntroTaskLast5(55));
        System.out.println(IntroTaskLast5(129));

        System.out.println(IntroTaskSameDigits(155));
        System.out.println(IntroTaskSameDigits(158));
        System.out.println(IntroTaskSameDigits(1588));
        System.out.println(IntroTaskSameDigits(1958));
        System.out.println(IntroTaskSameDigits(3));

        System.out.println(IntroTaskLeap(1584));
        System.out.println(IntroTaskLeap(400));
        System.out.println(IntroTaskLeap(2020));

    }
    private static boolean Task3Digits (int x){
        return 99<x && x<1000;
    }
    private static boolean IntroTaskLast5 (int y){
        return y%10==5;
    }
    private static boolean IntroTaskSameDigits(int z){
        if (z<10){
            System.out.println("Нет двух цифр");
            // я хотела, чтобы после этого шел break,  но не знала, как написать
        }
        int a= (z%100)/10;
        int b= z%10;
        return a == b;


    }

    private static boolean IntroTaskLeap(int year){
        if (year%100==0) {
            return year % 400 == 0;
        }
        else
            return year%4==0;
    }


}
