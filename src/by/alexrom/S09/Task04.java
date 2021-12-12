package by.alexrom.S09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task04 {

    public static void main(String[] args) {
        Task04 task04 = new Task04();
        task04.createFileWithNumbers("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\numbers2.txt");
        String s = task04
                .readFileWithNumbers("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\numbers2.txt");
        String[] strings = s.split(" ");
        task04.createFileWithPositiveNumbers(strings, "E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\positive2.txt");
        task04.createFileWithNegativeNumbers(strings, "E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\negative2.txt");
    }

    private String generatNumners(int size) {
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

    File createFileWithNumbers(String path) {
        File fileWithNumbers = new File(path);
        try(FileWriter writer = new FileWriter(fileWithNumbers, false)) {
            writer.write(generatNumners(200));
        } catch(IOException e) {
            e.printStackTrace();
        }
        return fileWithNumbers;
    }

    String readFileWithNumbers(String path) {
        String numbersInString = null;
        try(FileReader stream = new FileReader(path);
            BufferedReader reader = new BufferedReader(stream)) {
            numbersInString = reader.readLine();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return numbersInString;
    }

    File createFileWithPositiveNumbers(String[] numbers, String path) {
        File fileWithPositiveNumbers = new File(path);
        try(FileWriter writer = new FileWriter(fileWithPositiveNumbers, false)) {
            writer.write(sortNumbersToPositive(numbers));
        } catch(IOException e) {
            e.printStackTrace();
        }
        return fileWithPositiveNumbers;
    }

    File createFileWithNegativeNumbers(String[] numbers, String path) {
        File fileWithNegativeNumbers = new File(path);
        try(FileWriter writer = new FileWriter(fileWithNegativeNumbers, false)) {
            writer.write(sortNumbersToNegative(numbers));
        } catch(IOException e) {
            e.printStackTrace();
        }
        return fileWithNegativeNumbers;
    }

    //    private String[] splitReadedFile(String s) {
    //        return s.split(" ");
    //    }

    private String sortNumbersToPositive(String[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num > 0) {
                stringBuilder.append(num).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private String sortNumbersToNegative(String[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num < 0) {
                stringBuilder.append(num).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
