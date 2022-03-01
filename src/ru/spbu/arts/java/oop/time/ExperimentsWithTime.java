package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(String args[]) {
        Time test1 = new Time(25,15);
        Time test2 = new Time(10,9);
        Time test3 = new Time(50, 9);
        Time test4 = new Time(20,9);
        Time test5 = new Time(55,23);

        System.out.println(test1.show());

        System.out.println(test1.isMorning());
        System.out.println(test2.isDay());
        System.out.println(test3.isEvening());
        System.out.println(test5.isNight());

        System.out.println(test4.sayHello());

        test2.add(20);
        System.out.println(test2.show());
        test3.add(20);
        System.out.println(test3.show());
        test4.add(120);
        System.out.println(test4.show());
        test5.add(15);
        System.out.println(test5.show());


    }
}
