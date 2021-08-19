package HomeWorkGeek;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Объявить переменную типа String, название которой состоит из нескольких слов
        String myFirstHomeWork;

        //Создать константу “num” типа int и задать ей любое значение
        final int num = 19;

        //Создать переменную “word” типа String с любым значением
        String word = "Жаки, когда бухать?";

        //Задать значение переменной объявленной в самом начале, которое состояло бы
        //из результата конкатенации константы “num” и переменной “word”
        myFirstHomeWork = word + num;
        System.out.println(myFirstHomeWork);

        //Вывести на экран значение всех переменных в одну строку
        System.out.print(num + " " + word + " " + myFirstHomeWork + "\n");

        //Добавить условную конструкцию которая бы выводила на экран следующее: если
        //значение константы “num” меньше нуля -
        // “Вы сохранили отрицательное число”, если же значение больше нуля -
        // “Вы сохранили положительное число”, иначе - “Вы сохранили нуль”

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");

        } else {
            System.out.println("Вы сохранили нуль");

        }

        //ДЗ на сообразительность:
        //- Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя:”
        //- Затем считывала имя пользователя, введенное с клавиатуры
        //- И в конце здоровалась с пользователем по имени

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name);
        System.out.println("Здравствуйте " + name);
        System.out.println("Здравствуйте " + name);



    }
}
