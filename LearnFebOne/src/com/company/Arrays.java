package com.company;

public class Arrays {
    public static void main(String[] args) {
        int num =10; //примитивный тип данных                       [10]
        /*char character = 'a';//примитивный тип данных
        String s = "Hello";//ссылочный тип данных
        String s1 = new String("Hello");*/
        int[] numbers = new int[5];//ссылочный тип данных           numbers---> [массив]
        System.out.println(numbers[0]);                             //0 1 2 3 4
        /*numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;*/
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = i * 10;
        }
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        int[] numbersOne = {1,2,3};
        System.out.println(numbersOne[1]);
        for (int i = 0;i<numbersOne.length;i++){
            numbersOne[i] = i*5;
            System.out.println(numbersOne[i]);
        }
        System.out.println(numbersOne[1]);
    }
}
