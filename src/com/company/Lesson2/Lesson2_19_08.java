package com.company.Lesson2;

import java.util.Scanner;

public class Lesson2_19_08 {
    public static void main(String[] args) {
        String value = "Красный";
        switch (value) {
            case "Красный":
                System.out.println("Вы злой");
                break;
            case "Оранжевый":
                System.out.println("Вы веселый");
                break;
            case "Белый":
                System.out.println("Вы добрый");
                break;
            default:
                System.out.println("Вы обычный");
                break;
        }

        if (value == "Оранжевый" || value.length() > 3) {
            printText("Hello world", 2021);
            name();
            System.out.println(sum(10, 3));
        }
    }

    static void name() {
        System.out.println("Проверка прошла");
    }

    public static void printText(String txt, int i) {
        System.out.println(txt + " " + i);
    }

    static int sum(int a, int b) {
        return a + b;
    }

}
