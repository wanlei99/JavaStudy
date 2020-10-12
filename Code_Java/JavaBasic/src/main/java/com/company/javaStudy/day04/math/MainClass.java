package com.company.javaStudy.day04.math;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MainClass {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 5);
        Rational r2 = new Rational(3, 2);
        Rational result = new Rational(3, 2);
        int a = result.getNumerator();
        int b = result.getDenominator();
        System.out.println("1/5 + 3/2 = "+a+"/"+b);
        result = r1.sub(r2);
        a = result.getNumerator();
        b = result.getDenominator();
        System.out.println("1/5 - 3/2 = "+a+"/"+b);
        result = r1.sub(r2);
        a = result.getNumerator();
        b = result.getDenominator();
        System.out.println("1/5*3/2= "+ a +"/"+b);
        result = r1.muti(r2);
        a = result.getNumerator();
        b = result.getDenominator();
        System.out.println("1/5/3/2="+a+"/"+b);
        int n = 0,k = 1;
        System.out.println("计算2/1+3/2+5/3+13/8+....的前"+n+"项和");
        Rational sum = new Rational(0,1);
        Rational item = new Rational(2,1);
        while (k<=n){
            sum = sum.add(item);
            k++;
            int fenzi = item.getNumerator();
            int fenmu = item.getDenominator();
            item.setNumberatorAndDenominator(fenzi+fenmu,fenzi);

        }
        a = sum.getNumerator();
        b = sum.getDenominator();
        System.out.println("用分数表示：");
        System.out.println(a+"/"+b);
        double doubleResult = (a*1.0)/b;
        System.out.println("用小数表示：");
        System.out.println(doubleResult);
    }


}
