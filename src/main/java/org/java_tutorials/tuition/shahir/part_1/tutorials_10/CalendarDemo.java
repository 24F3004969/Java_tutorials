package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo
{
    public static void main(String[] args) {
        String []months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Calendar calendar=Calendar.getInstance();
        Date date=new Date();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
    }
}
