package com.pb.konstantinova.hw9;

import java.io.*;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) {
               try (Writer writer = new FileWriter("files/numbers.txt")) {

            int[][] array = new int[10][10];
            for (int i=0; i< array.length; i++, System.out.println()){
                for (int j=0; j<array.length; j++){
                    array[i][j]=((int) (Math.random()*99+1));
                    System.out.println(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }


        try (Scanner in = new Scanner(new File("files/numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("files/odd-numbers.txt"));
            System.out.println("Вывод c заменой на целфе числа на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.println("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.println(ch + " ");
                }
                line.close();
                pw.println();
                System.out.println();

            }
            pw.close();
        } catch (IOException ioException) {
            System.out.println("Файл не был записан" + ioException);
        }
        //   }





    }

}
