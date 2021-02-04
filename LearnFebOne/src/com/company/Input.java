package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String s = new String("New String");
        Scanner a = new Scanner(System.in);
        //System.out.println("com.company.Input some text");
        //String string = a.nextLine();
        System.out.println("com.company.Input some integer");
        int x = a.nextInt();
        System.out.println("Вы ввели " + x/*string*/);
    }
}
