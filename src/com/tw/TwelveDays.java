package com.tw;

public class TwelveDays {
    public static void main(String[] args) {
        song(12);
    }

    public static void song(int num) {
        if (num > 0) {
            song(num - 1);
        }

        switch (num) {
            case 12:
                System.out.println("On the twelfth day of Christmas, my true love sent to me, twelve drummers drumming.");
            case 11:
                System.out.println("On the eleventh day of Christmas, my true love sent to me, eleven pipers piping.");
            case 10:
                System.out.println("On the tenth day of Christmas, my true love sent to me, ten lords a-leaping.");
            case 9:
                System.out.println("On the ninth day of Christmas, my true love sent to me, nine ladies dancing.");
            case 8:
                System.out.println("On the eighth day of Christmas, my true love sent to me, eight maids a-milking.");
            case 7:
                System.out.println("On the seventh day of Christmas, my true love sent to me, seven swans a-swimming.");
            case 6:
                System.out.println("On the sixth day of Christmas, my true love sent to me, six geese a-laying.");
            case 5:
                System.out.println("On the fifth day of Christmas, my true love sent to me, five golden rings.");
            case 4:
                System.out.println("On the fourth day of Christmas, my true love sent to me, four calling birds.");
            case 3:
                System.out.println("On the third day of Christmas, my true love sent to me, three french hens.");
            case 2:
                System.out.println("On the second day of Christmas, my true love sent to me, two turtle doves.");
            case 1:
                System.out.println("On the first day of Christmas, my true love sent to me, a partridge in a pear tree.");
        }
        System.out.println();
    }
}
