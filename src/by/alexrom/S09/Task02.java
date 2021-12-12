package by.alexrom.S09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task02 {

    public static void main(String[] args) throws IOException {
        File fileNumbers = new File("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\numbers.txt");
        File positiveNumbers = new File("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\positiveNumbers.txt");
        File negativeNumbers = new File("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\negativeNumbers.txt");
        Task02 task02 = new Task02();

        try(FileWriter writer = new FileWriter(fileNumbers, false);
            FileWriter writerPositive = new FileWriter(positiveNumbers, false);
            FileWriter writerNegative = new FileWriter(negativeNumbers, false);
            FileInputStream stream = new FileInputStream(fileNumbers);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

            writer.write(task02.createNumbers(200));
            writer.flush();

            String[] s = reader.readLine().split(" ");
            for(int i = 0; i < s.length; i++) {
                int integer = Integer.parseInt(s[i]);

                if(integer > 0) {
                   writerPositive.write(s[i]);
                }
                if(integer<0) {
                    writerNegative.write(s[i]);
                }
            }
        }
    }

    String createNumbers(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++) {
            stringBuilder.append(random.nextInt(100)).append(" ");
            if(i % 2 == 0) {
                ++i;
                stringBuilder.append(random.nextInt(100) - 100).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

