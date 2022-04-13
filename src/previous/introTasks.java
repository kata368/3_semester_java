package previous;

import java.lang.Math;
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

        System.out.println(IntroTaskCat(11));
        System.out.println(IntroTaskCat(103));
        System.out.println(IntroTaskCat(1));

        System.out.println(primalityTest(37));
        System.out.println(primalityTest(122));
        System.out.println(primalityTest(107));

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

    private static String IntroTaskCat(int numberOfCats){
        if (numberOfCats%10==1 && numberOfCats%100!=11){
            return numberOfCats+" кот";
        }else if (numberOfCats%10==2 || numberOfCats%10==3 || numberOfCats%10==4){
            return numberOfCats+" кота";
        }else{
            return numberOfCats+" котов";

        }
    }

    private static boolean primalityTest (int numberForSqrt) {
        int broj = ((int) Math.sqrt(numberForSqrt)) + 1;
        for (int x = 2; x < broj; x += 1) {
            return (numberForSqrt % x == 0);
        }
        return true;
    }
}
// не знаю, как по другому....




