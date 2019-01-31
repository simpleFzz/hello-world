package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 5);
        Date date = cal.getTime();
        System.out.println(sdf.format(date));
    }



}
