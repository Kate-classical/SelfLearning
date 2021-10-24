package by.alexrom.s07.converter;

public class StringToIntConverter implements Converter<String, Integer> {
//
//    String message;
//
//    public StringToIntConverter(String message) {
//        this.message = message;
//    }

    @Override
    public Integer convert(String s) {
        int i = s.length();
        return i;
    }
}

class IntToStringConvert implements Converter<Integer, String> {
//
//    int toConvert;
//
//    public IntToStringConvert(int toConvert) {
//        this.toConvert = toConvert;
//    }

    @Override
    public String convert(Integer integer) {
        StringBuilder s = new StringBuilder();
        while (integer > 1) {
            integer = integer / 10;
            s.append(integer);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        StringToIntConverter stringToIntConverter = new StringToIntConverter();
        System.out.println(stringToIntConverter.convert("okay"));

        IntToStringConvert intToStringConvert = new IntToStringConvert();
        System.out.println(intToStringConvert.convert(123));
    }
}