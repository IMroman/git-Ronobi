package com.company;
//при делении на четное число остаток от деления всегда будет = 0
public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if(i==15){
                break;
            }
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("LoopIsEnd");
        for(int g = 0;g<=15;g++){
           if(g%2==0){
               continue;
           }
            System.out.println("ThisIsNotEvenInt " + g);
        }
    }
}
