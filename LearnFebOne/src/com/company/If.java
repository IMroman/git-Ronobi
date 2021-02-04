package com.company;

public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if(myInt<10){
            System.out.println("Верно");
        } else if (myInt>20){
            System.out.println("Не верно");
        }
        else {
            System.out.println("Ни один из предыдущих");
        }
    }
}
