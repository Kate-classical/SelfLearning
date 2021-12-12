package by.alexrom.s13;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public MyThread(Runnable target) {
        super(target);
    }
}
