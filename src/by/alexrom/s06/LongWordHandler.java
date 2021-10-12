package by.alexrom.s06;

public class LongWordHandler implements Handler {

    int m;
    int n;

    public LongWordHandler(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public String handleMessage(String message) {
        return checkWordsCount(message);
    }

    private String checkWordsCount(String message) {
        String[] strings = message.split(" ");
        if (strings.length < m) {
            return null;
        } else {
            for (String str : strings) {
                if (str.length() < n) {
                    return null;
                }
            }
        }
        return message;
    }
}
