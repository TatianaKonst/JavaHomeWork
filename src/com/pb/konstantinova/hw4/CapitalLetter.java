package com.pb.konstantinova.hw4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();
        System.out.println("Текст преобразован: "+firstToUppercase(input));
    }

    public static String firstToUppercase(String a) {

        Matcher mth = Pattern.compile("^(\\p{L})|\\s(\\p{L})").matcher(a);

        while (mth.find()) {
            a = a.replaceFirst(mth.group(), mth.group().toUpperCase());
        }
        return a;
    }
}
