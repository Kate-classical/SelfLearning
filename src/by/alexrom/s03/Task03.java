package by.alexrom.s03;

public class Task03 {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print(n);
                } else {
                    if (j == 0 || j == m - 1) {
                        System.out.print(m);
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");

        }
    }
    // Не сделано
}
