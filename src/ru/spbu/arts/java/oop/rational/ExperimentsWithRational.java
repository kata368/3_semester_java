package ru.spbu.arts.java.oop.rational;

public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational test1= new Rational(1,24);
        Rational test2 = new Rational(120,336);
        Rational test3 = new Rational(1,2);
        Rational test4 = new Rational(45, 0);
        Rational test5 = new Rational(2,5);
        Rational test6 = new Rational(5,8);
        Rational test7 = new Rational(1,6);
        Rational test8 = new Rational(2,15);

        //System.out.println(test1); // почему печатает с /? Даже без доп функции....
        //System.out.println(test2);

        test3.toDouble();
        System.out.println(test3);

        test1.addInPlace(test5);
        System.out.println(test1);

        Rational r1 = test2.add(test5);
        System.out.println(r1);

        test6.subInPlace(test5);
        System.out.println(test6);

        Rational r2=test5.sub(test1);
        System.out.println(r2);

        r2.mulInPlace(test7);
        System.out.println(r2);

        Rational r3 = test2.mul(test7);
        System.out.println(r3);

        test8.divInPlace(test7);
        System.out.println(test8);

        Rational r4 = test8.div(test7);
        System.out.println(r4);




    }
}
