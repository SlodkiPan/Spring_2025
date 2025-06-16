package org.example;

import java.io.*;
//класс для записи в файл

public class writeFile {
    void write() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            String text;
            while (!(text = br.readLine()).equals("exit")) {
                bw.write(text + "\n");
                bw.flush();
                Main.choosingMenu.choosingAnAction.start();

            }
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
