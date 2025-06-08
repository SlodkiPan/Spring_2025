package org.example;

import java.io.*;
import java.util.Scanner;


//Вариант по информатики №15 Подсчитать число латинских букв в данном тексте.

public class Main {
    public static void main(String[] args) {
        choosingMenu.choosingAnAction.start();
    }
//Создаём класс для создания файла для записи в него текста
    public static class choosingMenu {
        static class choosingAnAction {
//Метод для выбора выполнения действия
            static void start() {
                int number;
                Scanner sc = new Scanner(System.in);
                System.out.println("Выбирите пункт меню\n" +
                        "           Введите число      \n" +
                        "            1.  Создать файл                    \n" +
                        "            2.  Запись в файл через консоль    \n" +
                        "            3.  Посчитать сколько латинских букв в тексте\n" +
                        "            4.  Выход                 \n");

                if (sc.hasNextInt()) {// проверка на введения правильность вводимых данных
                    number = sc.nextInt();

                    switch (number) {
                        case 1:
                            System.out.println("Создаём файл");
                            newFile newFile = new newFile();
                            newFile.createFile();
                            start();

                        case 2:
                            System.out.println("Напишите текст, который будет добавлен в файл");
                            writeFile wr = new writeFile();
                            wr.write();
                            start();
                        case 3:
                            System.out.println("Считаем количество латинских букв");
                            letterCount lc = new letterCount();
                            lc.countingLetterCountFile();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            throw new IllegalStateException("Неизвестное значение : " + number);
                    }


                } else {
                    System.out.println("Извините, но это не число. Перезапустите программу и попробуйте снова!");
                }
            }
        }
    }


}









