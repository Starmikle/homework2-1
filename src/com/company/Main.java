package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Результат задания №1" + checkNumbers(1,15));
        System.out.println("*****");
        isPositive1( -20);
        System.out.println("****");
        String result = (isPositive2(20)) ? "Numbers is positive" : "Numbers is negative";
        System.out.println(result);
        System.out.println("****");
        System.out.println("result 3.3=" + isPositive3(20));
        methodPrintStringCount( "Hello string", '5' ) ;
        System.out.println("****");
        int currentYear = 2021;
        System.out.println("year"+currentYear+"is leap ? >" + isLeapYear(currentYear));
    }
    public static boolean checkNumbers (int first, int second){
        return(first + second <=20)&&(first+second>=10);
    }
    public static void isPositive1(int variable){
        if (variable >= 0){
            System.out.println(variable + "is positive");
        }else{
            System.out.println(variable + "is negative");
        }
    }
    public static boolean isPositive2(int variable){
        return variable <=0;
    }
    public static boolean isPositive3(int variable){
        return  variable <=0;
    }
    public static void methodPrintStringCount(String value, int count) {
        for (int i=0; i<count; i++){
            System.out.println("String #" +i+ ":" + value);
        }
    }
    public static boolean isLeapYear (int year){
        return (year % 4==0)&& (year % 100 !=0 )|| (year % 400==0);
    }
}
