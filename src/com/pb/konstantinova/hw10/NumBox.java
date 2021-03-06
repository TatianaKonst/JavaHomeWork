package com.pb.konstantinova.hw10;

public class NumBox {
    <T extends Number>{
        private final T[] arrayT;


    public NumBox(int i){
            this.arrayT = (T[]) new Number[i];
        }

        public void add(T num)throws ArrayIndexOutOfBoundsException{
            if (this.length()== arrayT.length) throw new ArrayIndexOutOfBoundsException("Превышен размер массива");
            arrayT[this.length()] =num;
        }
        public T get(int index) {
            try {
                return this.arrayT[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Значение за пределами массива");
                return null;
            }
        }
        public int length(){
            int count=0;
            for (T el:arrayT) {
                if (el==null) return count;
                count++;
            }
            return count;
        }

        public double average(){
            double average = 0;
            int length = this.length();
            if (length == 0) return average;

            return this.sum()/(double) length;
        }

        public double sum(){
            double sum = 0;
            for (T el:arrayT) {
                if (el!= null)sum += el.doubleValue();
                else break;
            }
            return sum;
        }

        public T max(){
            T max = arrayT[0];
            for (T el:arrayT) {
                if (el!= null && el.doubleValue()>max.doubleValue())max = el;
            }
            return max ;
        }
        public void print(){
            for (T el:arrayT) System.out.println(el);
        }

        public static void main(String[] args) {
            NumBox<Integer> numBox = new NumBox<>(10);
            NumBox <Float> numBoxF = new NumBox<>(11);
            try {
                for (int i=11;i>0;i--)numBox.add(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            numBox.print();
            System.out.println("Первый елемент массива: " + numBox.get(0));
            System.out.println("Количество елементов: " + numBox.length());
            System.out.println("Средне арифметический среди элементов массива:" + numBox.average());
            System.out.println("Сумма всех элементов массива: " + numBox.sum());
            System.out.println("Максимальный элемент массива: " + numBox.max());

            // Float
            try {
                for (int j=11;j>0;j--)numBoxF.add((float)j);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            numBox.print();
            System.out.println("Первый елемент массива: " + numBoxF.get(0));
            System.out.println("Количество елементов: " + numBoxF.length());
            System.out.println("Средне арифметический среди элементов массива:" + numBoxF.average());
            System.out.println("Сумма всех элементов массива: " + numBoxF.sum());
            System.out.println("Максимальный элемент массива: " + numBoxF.max());

        }

    }
