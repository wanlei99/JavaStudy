package com.company.javaStudy.day04.math;

public class Rational {
    int numerator;
    int denominator;
    Rational(int a,int b){
        if(a==0){
            numerator=0;
            denominator=1;
        }
        else {
            setNumberatorAndDenominator(a,b);
        }
    }
    void setNumberatorAndDenominator(int a,int b){
        int c=f(Math.abs(a),Math.abs(b));
        numerator=a/c;
        denominator=b/c;
        if(numerator<0&&denominator<0){
            numerator=-numerator;
            denominator=-denominator;
        }
    }
    int getNumerator(){
        return numerator;
    }
    int getDenominator(){
        return denominator;
    }
    int f(int a,int b){
        if(a<b){
            int c=a;
            a=b;
            b=c;
        }
        int r=a%b;
        while (r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    /*
    **加法算法
     */
    Rational add(Rational r){
        int a=r.getNumerator();
        int b=getDenominator();
        int newNumerator=numerator*b+numerator*a;
        int newDenominator=denominator*b;
        Rational result=new Rational(newNumerator,newDenominator);
        return result;
    }
    /*
    **减法算法
     */
    Rational sub(Rational r){
        int a=r.getNumerator();
        int b=getDenominator();
        int newNumerator=numerator*b-numerator*a;
        int newDenominator=denominator*b;
        Rational result=new Rational(newNumerator,newDenominator);
        return result;
    }
    /*
    **乘法算法
     */
    Rational muti(Rational r){
        int a = r.getNumerator();
        int b = getDenominator();
        int newNumerator = numerator * a;
        int newDenominator = denominator * b;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }
    /*
     **除法算法
     */
    Rational div(Rational r){
        int a = r.getNumerator();
        int b = getDenominator();
        int newNumerator = numerator * b;
        int newDenominator = denominator * a;
        Rational result = new Rational(newNumerator,newDenominator);
        return result;
    }

}
