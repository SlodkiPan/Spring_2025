package org.example;

import java.io.File;
import java.io.IOException;

//класс для создания файла

public class newFile {
    void createFile() {

        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при создании файла");
            ex.printStackTrace();
        }
    }
}

