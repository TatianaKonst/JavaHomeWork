package com.pb.konstantinova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int bingo = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        String round;
        int roundNumber;
        System.out.println("Отгадай число от 0 до 100. Попробуй!");
        while (true){
            System.out.print("Введи число:");
            round = scanner.next();
            if (round.equals("exit"))  break;
            try {
                roundNumber = Integer.parseInt(round);
            } catch(NumberFormatException e){
                System.out.println("Не верно! Для выхода необходимо ввести команду \"exit\"!");
                continue;
            }
            count ++;
            if ( roundNumber!= bingo) {
                if (roundNumber<bingo){
                    System.out.println("Твое число "+roundNumber+" меньше загаданного! Еще попытка! \n Для выхода необходимо ввести команду \"exit\"!");
                }else{
                    System.out.println("Твое число "+roundNumber+" больше загаданного! Еще попытка! \n Для выхода необходимо ввести команду \"exit\"!");
                }
                continue;
            }

            System.out.println("Ты смог! Ты отгадал число "+bingo+" с "+count+" попыток.");
            break;
        }
        System.out.println("Игра завершена!");
    }
}
