package by.alexrom.s10;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> names = new MyLinkedList<>();

        names.put("tolik");
        names.put("tolik2");
        names.put("tolik3");
        names.put("tolik4");

        for(int i = 0; i <names.length() ; i++) {
            names.remove(i);
            System.out.println(names.get(i));
        }



    }
}
