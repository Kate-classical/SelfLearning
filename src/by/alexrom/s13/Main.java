package by.alexrom.s13;

import sun.awt.windows.ThemeReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static int getPossition = 0;
    private static List<List<Character>> listWithChar100List = new ArrayList<>();
    public static Map<Character,Integer> alphabetMapRuss = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main started");
        Main main = new Main();
        String readFileString = main
                .readFile("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\13 Основы многопоточного программирования\\russian text.txt");
        main.catStringBy100ChPutToList(readFileString);
        main.fillMap();

        List<Thread> threads = new ArrayList<>();

        for(int i = 0; i < 33; i++) {
            List<Character> list = listWithChar100List.get(i);
            MyThread myThread = new MyThread(() -> {
                for(Character ch : list) {
                    if(alphabetMapRuss.containsKey(ch)) {
                        Integer i1 = alphabetMapRuss.get(ch);
                        synchronized(i1) {
                            System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getName());
                            try {
                                Thread.sleep(1000);
                            } catch(InterruptedException e) {
                                e.printStackTrace();
                            }

                            alphabetMapRuss.put(ch, ++i1);
                        }
                    }
                }
            });
            threads.add(myThread);
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            t.join();
        }

        System.out.println(alphabetMapRuss);

        Map<Character,Integer> sortedMapDesc = SortHashMap.sortByComparator(alphabetMapRuss, false);
        System.out.println(sortedMapDesc);
        System.out.println("Main finished");
    }

    public static void read100Char() {
        for(Character ch : listWithChar100List.get(getPossition)) {
            if(alphabetMapRuss.containsKey(ch)) {
                Integer i = alphabetMapRuss.get(ch) + 1;
                alphabetMapRuss.put(ch, i);
            }
        }
        getPossition++;
    }

    String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader fileReader = new FileReader(path)) {
            int c;
            while((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString().replaceAll("[^а-яА-Я]", "").toUpperCase();
    }

    void catStringBy100ChPutToList(String string) {
        List<Character> characters100 = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            if(characters100.size() < 100) {
                characters100.add(string.charAt(i));
            } else {
                listWithChar100List.add(characters100);
                characters100 = new ArrayList<>();
            }
        }
    }

    void fillMap() {
        Integer couner = 0;
        String alfabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        for(int i = 0; i < alfabet.length(); i++) {
            alphabetMapRuss.put(alfabet.charAt(i), couner);
        }
    }
}
