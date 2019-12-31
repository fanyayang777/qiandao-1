package cn.qiandao.util;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.text.SimpleDateFormat;

@Component
public class DateTime {

    public java.sql.Date getDate(){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = df.format(day);
        Date d = null;
        try {
            d = df.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }

}
