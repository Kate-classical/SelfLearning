package by.alexrom.s07.converter;

public interface Converter<IN, OUT> {
    OUT convert(IN in);
}
