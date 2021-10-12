package by.alexrom.s06;

public class AlphabetHandler implements Handler {

    private Handler handler;

    public AlphabetHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String handleMessage(String message) {
        return handler.handleMessage(checkNumbersInMessage(message));
    }

    private String checkNumbersInMessage(String message) {
        if (message.matches(".*\\d+.*")) {
            return null;
        }
        return message;
    }

}
