package com.company;

public class MultiArrays {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        /**
         * 1,2,3,4,5,0,-1,-2
         * 1 чило - номер строки, 2 число - номер столбца, их пересечение - поисковое число
         * 1 5 6
         * 3 7 6
         * 2 6 8
         * например, для числа 7 матрицей выше будет запрос [1][1]
         */
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrice[0][2]);//3
        int[][] num1 = {{1,2,3,4,5,},{6,7},{8,9,10,11}};
        System.out.println(num1[2][3]);//11

        //инициализация массивов
        int[] number1 = new int[5];
        String[][] s = new String[2][3];
        s[0][2] = "Hello";
        System.out.println(s[0][2]);

        int[][] k = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        for(int i = 0;i<k.length;i++){//проходит по строкам
            for (int j = 0;j<k[i].length;j++){//проходит по каждому элементу строки
                System.out.print(k[i][j] +" ");
            }
            System.out.println();
        }
        //каждый элемент двумерного массива - это одномерный массив (потому их 3)
    }
}
