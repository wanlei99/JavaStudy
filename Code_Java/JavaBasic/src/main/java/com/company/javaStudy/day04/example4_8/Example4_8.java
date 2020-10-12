package com.company.javaStudy.day04.example4_8;

/**
 * @ClassName Example4_8
 * @Description 第四章4.8
 * @Author WL
 * @Date 2020/10/6
 **/
public class Example4_8 {
    public static void main(String[] args) {
        Ladder.下底 = 100;
        Ladder ladderTwo = new Ladder();
        Ladder ladderOne = new Ladder();
        ladderTwo.设置上底(66);
        ladderOne.设置下底(28);
        System.out.println("ladderOne的上底："+ ladderOne.获取上底());
        System.out.println("ladderOne的下底"+ladderOne.获取下底());
        System.out.println("ladderTwo的上底："+ladderTwo.获取上底());
        System.out.println("ladderTwo的下底："+ladderTwo.获取下底());
    }
}
