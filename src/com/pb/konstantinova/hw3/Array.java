package com.pb.konstantinova.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] arraySort;
        int sum = 0;
        int element = 0;
        int sorting;
        boolean sorted = false;

        System.out.println("Введите 10 чисел (целое)");
        for(int i=0;i<array.length;i++){
            System.out.print("array["+i+"]: ");
            array[i]= scanner.nextInt();
            sum +=array[i];
            if (array[i] > 0) element++;
        }
        arraySort = array.clone();


        while (!sorted){
            sorted = true;
            for (int i=0;i<arraySort.length-1;i++){
                if (arraySort[i]>arraySort[i+1]){
                    sorted =false;
                    sorting = arraySort[i+1];
                    arraySort[i+1]=arraySort[i];
                    arraySort[i] = sorting;
                }
            }
        }
        System.out.print("Исходный массив: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();// переход на новую строку
        System.out.println("Сумма: "+sum);
        System.out.println("Количество положительных элементов': "+element);

        System.out.print("Сортировка этого массива от меньшего к большему: ");
        for (int anArray : arraySort) {
            System.out.print(anArray + " ");
        }
    }
}

