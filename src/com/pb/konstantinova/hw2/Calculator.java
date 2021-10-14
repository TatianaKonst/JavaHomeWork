package com.pb.konstantinova.hw2;

import java.util.Scanner;

public class Calculator {
       public static void main(String[] args) {
            int operand1,operand2;
            String sign;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
           operand1 = in.nextInt();
            System.out.print("Введите второе число: ");
           operand2 = in.nextInt();
            System.out.print("Введите операцию: ");
            sign = in.next();
            switch (sign){
                case "+" :
                    System.out.println("Результат: "+ (operand1+operand2));
                    break;
                case "-" :
                    System.out.println("Результат: "+ (operand1-operand2));
                    break;
                case "*" :
                    System.out.println("Результат: "+ (operand1*operand2));
                    break;
                case "/" :
                    if (operand2 == 0) {
                        System.out.println("Операция не допустима. Деление на ноль запрещено");
                    }else {
                        System.out.println("Результат: " + (operand1 / operand2));
                    }
                    break;

                default:
                    System.out.println("Вы допустили ошибку. Попробуйте еще раз");
            }


        }
    }