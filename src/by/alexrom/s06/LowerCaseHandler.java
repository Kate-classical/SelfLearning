package by.alexrom.s06;

import java.util.StringJoiner;

public class LowerCaseHandler implements Handler {

    private Handler handler;

    public LowerCaseHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String handleMessage(String message) {
        return handler.handleMessage(message.toLowerCase().trim());
    }

//    @Override
//    public String toString() {
//        return new StringJoiner(", ", LowerCaseHandler.class.getSimpleName() + "[", "]")
//                .add("massage='" + massage + "'")
//                .toString();
//    }
}
