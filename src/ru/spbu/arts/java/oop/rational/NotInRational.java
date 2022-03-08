package ru.spbu.arts.java.oop.rational;

public class NotInRational {
    public static void main(String[] args) {
        task7(1);
        task7(2);
        task7(3);
        task7(20);

    }

    public static void task7(int n){
        double answer=0;
        for (int i =1; i<=n; i++){
            answer+=Math.pow(i, -1);
        }
        System.out.println(answer);  // сразу было 3,597...
        // проверила по калькулятору, вроде бы правильно, не понимаю 8 задачу...
    }
}
