package com.pb.konstantinova.hw4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagram {
    public static void main(String[] args) {
        String text1, text2;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первую строку");
        text1 = in.nextLine();

        System.out.println("Введите вторую строку");
        text2 = in.nextLine();

        isAnagram(text1, text2);

    }

    public static void isAnagram(String text1, String text2) {
        char[] arr1 = clearString(text1).toCharArray();
        char[] arr2 = clearString(text2).toCharArray();
        text1 = String.valueOf(sortArray(arr1));
        text2 = String.valueOf(sortArray(arr2));

        if (text1.equals(text2)) {
            System.out.println("Вторая строка - анаграмма первой строки");
        }else {
            System.out.println("Вторая строка - не анаграмма первой строки");
        }
    }

    public static String clearString(String str) {
        String result = "";
        Pattern pattern = Pattern.compile("[а-я]+");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        while (matcher.find()) {
            result += matcher.group();
        }
        return result;
    }

    public static char[] sortArray(char[] array) {
        int to = array.length - 1;
        for (int i = 0; i < to; i++) {
            char temp;
            for (int j = 0; j < to - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
