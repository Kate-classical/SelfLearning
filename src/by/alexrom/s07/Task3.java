package by.alexrom.s07;

public class Task3<T, K> extends Number {
    T t;
    K k;

    @Override
    public int intValue() {
        if (t instanceof Integer) {
            return (Integer) t;
        }
        if (k instanceof Integer) {
            return (Integer) k;
        }
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        if (task3.intValue()!=0){

        }
    }
}

