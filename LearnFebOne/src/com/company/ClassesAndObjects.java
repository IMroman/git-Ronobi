package com.company;
//в java классе может быть только один публичный класс
//имя публичного класса должно совпадать с именем файла java класса
//класс - это homo sapience, но объект класса - это я, ты и т.д.

//у класса могут быть:
//1. Данные (поля)
//2. Действия, которые он может совершать (методы)
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        //person1.setNameAndAge("Roman",26);
        //String s1 = "Vladimir";
        //person1.sayHi();//метод со скобками
        //Person person2 = new Person();
        //person2.setNameAndAge(s1,27);
        person1.setName("SomeName");
        person1.setAge(26);
        System.out.println("Output value in main method: "+ person1.getName());
        System.out.println("Output value in main method: "+ person1.getAge());
        //person1.speak();
        /*int years1 = person1.calculateToOld();
        int years2 = person2.calculateToOld();
        System.out.println("First person to old is: "+ years1 + " years ago");
        System.out.println("Second person to old is: "+years2 + " years ago");*/
    }
}
//сеттеры и геттеры - это пример инкапсуляции
class Person {//классы с большой буквы
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Error! Name must be not null");
        }else{
            name = username;
        }
    }
    public String getName (){
        return name;
    }

    public void setAge(int userAge){
        if(userAge>0){
        age = userAge;} else {
            System.out.println("Error! Years must be positive integer");
        }
    }
    /*void setNameAndAge(String username, int userage){
        name = username;
        age =userage;
    }*/

    public int getAge(){
        return age;
    }

    int calculateToOld(){
        int years = 65 - age;
        return years;//после return метод заканчивает свое выполнение
        //возвращать можно только тот же тип, что объявлен в методе
    }

    //() - это параметры метода (аргументы)
    //поля и методы знают о существовании друг друга
    void speak() {//методы с маленькой буквы
        for (int i = 0; i < 1; i++) {
            System.out.println("My name is " + name + ", i'm " + age + " years ago");
            //теперь у каждого объекта класса Person есть метод speak
        }
    }
    void sayHi(){
            System.out.println("Hello");
    }
}

