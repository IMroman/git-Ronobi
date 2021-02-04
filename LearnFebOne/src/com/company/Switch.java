package com.company;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("InputAge");
    /*int age = scanner.nextInt();
    if(age==10){
        System.out.println("LearnInSchool");
        } else if (age>10){
        System.out.println("YouWorkNow");
        } else if (age<10){
        System.out.println("YourKids");
        } else {
        System.out.println("WTF???");
        }*/
        /*switch (age){
            case 0:
                System.out.println("YouBorn");
                break;
            case 7:
                System.out.println("StartLearnSchool");
            case 18:
                System.out.println("CompleteSchool");
            default:
                System.out.println("NowYouStartThisLife");
        }*/
        String name = scanner.nextLine();
        switch (name){
            case "Anton":
                System.out.println("No,man");
                break;
            case "Julia":
                System.out.println("Lel");
                break;
            case "Roman":
                System.out.println("Yes");
                break;
            default:
                System.out.println("NoWay!YouForgotYourName!");
        }
    }
}
