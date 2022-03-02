package com.codedifferently.labs.lab25.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeConvertTest {

    @Test
    public void timeConvertTest01(){
        TimeConvert convert = new TimeConvert();
        Integer input = 63;
        String expected  = "1:3";
        String actual = convert.timeConvert(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void timeConvertTest02(){
        TimeConvert convert = new TimeConvert();
        Integer input = 178;
        String expected  = "2:58";
        String actual = convert.timeConvert(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void timeConvertTest03(){
        TimeConvert convert = new TimeConvert();
        Integer input = 249;
        String expected  = "4:9";
        String actual = convert.timeConvert(input);
        Assertions.assertEquals(expected,actual);
    }
}
