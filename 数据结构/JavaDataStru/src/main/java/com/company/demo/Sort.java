package com.company.demo;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author WL
 * @Date 2020/10/27
 **/
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,21,6};
        int array_mix = get_array_mix(arr, 7);
        System.out.println(array_mix);

    }
    static int get_array_mix(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            return arr[n - 1] < get_array_mix(arr, n - 1) ? arr[n - 1] : get_array_mix(arr, n - 1);
        }
    }

}

