package com.company.classJava.week4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ClassName MarketEmployeeTest
 * @Description TODO
 * @Author WL
 * @Date 2020/10/26
 **/
public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee me = new MarketEmployee("admin");
        me.print();
    }

   // @Test
    //public void getSalary() {
    //    MarketEmployee me = new MarketEmployee("admin");
    //   int salary = me.getSalary("admin");
    //   //assertEquals(4000, salary);
    //
    //   BaseEmployee be = new MarketEmployee("user") ;
    //   assertEquals(1000, be.getSalary());
    //}
}