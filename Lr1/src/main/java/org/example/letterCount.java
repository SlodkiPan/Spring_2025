package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//подсчёт количества латинских букв.

public class letterCount {
    int count = 0;

    void countingLetterCountFile() {
        String inputFileName = "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            int r;
            while ((r = reader.read()) != -1) {
                int length = 1;
//цикл проходиться по массиву текста и проверяет их на соответсвие кодировке ASCII
                char c = (char) r;
                for (int i = 0; i < length; i++) {
                    if ((c >= 97 && c <= 122) || c >= 66 && c <= 91) {
                        length++;
                        this.count++;
                        break;
                    } else {
                        break;

                    }
                }

            }
            System.out.println("Количество латинских букв = " + count);


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
