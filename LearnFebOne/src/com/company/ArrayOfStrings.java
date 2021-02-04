package com.company;

public class ArrayOfStrings {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers [0] = 10;
        System.out.println(numbers[0]);
        String[] strings = new String[3];//имена ссылочных типов как и классы пишутся с большой буквы
        //такой массив может в себя вместить три объекта класса String
        strings[0] = "Hello ";
        strings[1] = "my ";
        strings[2] = "friend";
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        for(int i = 0; i< strings.length;i++){
            System.out.println(strings[i]);
        }
        for(String string: strings){//тип данных имя переменной: имя массива
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
        }
        System.out.println(sum);

        int value = 0;
        String s;
    }
}
