package com.company.Lesson3;

public class Lesson3_23_08 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 5;
        array[2] = 4;
        array[3] = 3;
        array[4] = 6;


        int[] array2 = {1, 23, 4, 545, 6, 67, 7};


        // Создание циклов
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Разбор цикла while

        int count = 0;
        while (count < 10) {
            System.out.println("Работа цикла while " + count);

            if (count == 5) {
                break;
            }
            count++;
        }
        //Разбор цикла do.. while
        System.out.println("_______________");
        int count2 = 0;
        do {
            count2++;
            System.out.println("Работа цикла do while " + count2);
        } while (count2 < 8);

        // Разбор цикла forEach
        System.out.println("--------------------");
        for (int forEachArray : array) {

        }

        //Опретор continue

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);

        }
    }
}

