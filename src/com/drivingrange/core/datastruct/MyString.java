package com.drivingrange.core.datastruct;

public class MyString {

    public static void main(String[] args) {
        String hello = "Hello World";
        String 哈喽 = "你𤭢好";
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;

        //
        System.out.println("var hello's length is: " + hello.length());
        System.out.println("var hello code point count is: " + hello.codePointCount(0, hello.length()));
        System.out.println("var hello charAt 2 is: " + hello.charAt(2));
        System.out.println("var hello ... is: " + hello.codePointAt(hello.offsetByCodePoints(0, 6))); // 87

        //
        System.out.println("var 哈喽's length is: " + 哈喽.length());
        System.out.println("var 哈喽 code point count is:  " + 哈喽.codePointCount(0, 哈喽.length()));
        System.out.println("var 哈喽 charAt 1 is: " + 哈喽.charAt(1));
        System.out.println("var 哈喽 ... is: " + 哈喽.codePointAt(哈喽.offsetByCodePoints(0, 1))); // 22909

        // code point
        while(i < 哈喽.length()){
            int codePoint = 哈喽.codePointAt(i);
            System.out.println(codePoint);
            if(Character.isSupplementaryCodePoint(codePoint)){
                i += 2;
            }else{
                i++;
            }
        }

        // StringBuilder
        stringBuilder.append("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder.toString());
    }

}
