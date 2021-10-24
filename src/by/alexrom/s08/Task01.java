package by.alexrom.s08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {

    public static void main(String[] args) {

        File originalFile = new File("/E:/Downloads/Java Torrent/Jborn/JBorn_08/Java Core/8 Исключения/Task file.txt");
        File resultFile = new File("/E:/Downloads/Java Torrent/Jborn/JBorn_08/Java Core/8 Исключения/Task result.txt");

        resultOfTask(originalFile, resultFile);
    }

    //    Чтение из файла
    static String readFirstLine(File file) throws IOException, IllegalAccessException {
        if(!file.exists()) {
            throw new FileNotFoundException();
        } else if(!file.canExecute()) {
            throw new IllegalAccessException();
        }
        try(FileInputStream stream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            return reader.readLine();
        }
    }

    //    Запись строки в файл
    static void resultOfTask(File origionalFile, File resultFile) {
        try {
            String[] stringsArray = readFirstLine(origionalFile).split(" ");
            String result = calculResult(stringsArray);
            writeToFirst(resultFile, result);
        } catch(IllegalAccessException | IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static String calculResult(String[] stringsArray) {
        Integer res = 0;
        try {
            for(String s : stringsArray) {
                Integer a = Integer.parseInt(s);
                res = res + a;
            }
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error" + e.getMessage());
        }
        return String.valueOf(res);
    }

    static void writeToFirst(File file, String value) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write(value);
        writer.flush();
        writer.close();
    }
}
