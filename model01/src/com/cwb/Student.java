package com.cwb;

public class Student extends  Person {
    public void eat(){
        System.out.println("xuden4564");
    }

    public static void main(String[] args) {
        System.out.println("hell");
        System.out.println("args = [" + args + "]");
        System.out.println("Student.main");
        int nulm1=10;
        int number2=20;
        System.out.println("nulm1 = " + nulm1);
        System.out.println("number2 = " + number2);
        
        //
       String [] aa=new String[]{"tom","lilie"};
        for (int i = 0;  i<aa.length ; i++) {
            System.out.println(aa[i]);
        }
        for (String s : aa) {
            System.out.println(s);
        }

        //list for的遍历
    }


}
