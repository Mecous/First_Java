package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
/*         LocalDate newYearEve = LocalDate.of(2021,11,21);
        int year = newYearEve.getYear();
        int month = newYearEve.getMonthValue();
        int day = newYearEve.getDayOfMonth();

        System.out.println(year+" "+month+" "+day); */

        /* 获取当前时间方式 */
        //方法一
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        System.out.println(formatter.format(System.currentTimeMillis()));
        //方法二
        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
        //方法三
        Calendar cal=Calendar.getInstance();      
        int y=cal.get(Calendar.YEAR);      
        int m=cal.get(Calendar.MONTH) + 1; //为什么这个函数少一个月
        int d=cal.get(Calendar.DATE);      
        int h=cal.get(Calendar.HOUR_OF_DAY);      
        int mi=cal.get(Calendar.MINUTE);      
        int s=cal.get(Calendar.SECOND);      
        System.out.println("现在时刻是"+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");



    }


}
