package com.huawei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {

    public String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;

    public HelloWorld() {
    }

    public static void main(String[] args) {
        int b=12;
        String sdfsd="8898";
        System.out.println(sdfsd);
        Date date = new Date();
        String mm2="8898";
        System.out.println("hellworld");
        Date date1 = new Date();

        String mm3="8898";
        System.out.println("hellworld");
        Date date3 = new Date();

        List lise=new ArrayList();
        try {
            FileInputStream file=new FileInputStream("te");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
