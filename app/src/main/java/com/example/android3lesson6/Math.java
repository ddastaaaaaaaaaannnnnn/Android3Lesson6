package com.example.android3lesson6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String add(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 + num2);
    }

    public String subtract(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        return String.valueOf(num1 - num2);

    }

    public String minus(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "Error, negative number occurred";
        }
        return String.valueOf(num1 - num2);
    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);

    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num2 == 0) {
            return "Error,you can't divide by zero";
        }
        return String.valueOf(num1 / num2);
    }

    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p.matcher(a);
        boolean c = m1.find();

        if (c) {
            return "Error,special characters have been detected";
        }
        return String.valueOf(a + b);
    }
}