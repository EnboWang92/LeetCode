package com.enbo.tools;

import java.util.Scanner;

/**
 * Created by user on 2020/9/7.
 */
public class Time {
    public String convertSecondToTime(int second){
        StringBuilder stringBuilder = new StringBuilder();

        String h = String.valueOf(second / 3600);
        if (h.length() == 1){stringBuilder.append(0);}
        stringBuilder.append(h).append(":");

        String mi = String.valueOf((second % 3600) / 60);
        if (mi.length() == 1){stringBuilder.append(0);}
        stringBuilder.append(mi).append(":");

        String s = String.valueOf(second % 60);
        if (s.length() == 1){stringBuilder.append(0);}
        stringBuilder.append(s);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("convert second to hh:mi:ss, please input second:");
        Scanner input = new Scanner(System.in);
        while (true){
            int number1 = input.nextInt();
            System.out.println("result: " + time.convertSecondToTime(number1));
        }
    }
}
