package com.enbo.leetcode.easy;

/**
 * Created by user on 2020/7/23.
 */
public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        if(n == 0){return false;}
        long x = (long) n;
        return (x &(-x)) == x;
    }

    public boolean isPowerOfTwo2(int n) {
        if(n == 0){return false;}
        long x = (long) n;
        return (x & (x-1)) == 0;
    }
    public boolean isPowerOfTwo1(int n) {
        if(n == 0){return false;}
        while(n != 1 && n % 2 == 0){
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
//        System.out.println( -100 % 2);
        PowerofTwo powerofTwo = new PowerofTwo();
        System.out.println(powerofTwo.isPowerOfTwo(0));
        System.out.println(powerofTwo.isPowerOfTwo(1));
        System.out.println(powerofTwo.isPowerOfTwo(2));
        System.out.println(powerofTwo.isPowerOfTwo(3));
        System.out.println(powerofTwo.isPowerOfTwo(8));
        System.out.println(powerofTwo.isPowerOfTwo(1024));
        System.out.println(powerofTwo.isPowerOfTwo(1026));
        System.out.println(powerofTwo.isPowerOfTwo(Integer.MAX_VALUE));
        System.out.println(powerofTwo.isPowerOfTwo(Integer.MIN_VALUE));
    }
}
