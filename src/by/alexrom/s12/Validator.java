package by.alexrom.s12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;

public class Validator {

    boolean validate(Object obj) throws IllegalAccessException {
        Class<?> objClass = obj.getClass();

        Field[] declaredFields = objClass.getDeclaredFields();
        for(Field f : declaredFields) {
            f.setAccessible(true);
            Annotation[] annotations = f.getAnnotations();

            for(Annotation a : annotations) {

                if(a instanceof Min) {
                    int length = ((Min) a).length();
                    int objValue = f.getInt(obj);
                    if(objValue < length) {
                        throw new RuntimeException("Field " + f.getName() + " less than " + length);
                    }
                }

                if(a instanceof Max) {
                    int length = ((Max) a).length();
                    int objValue = f.getInt(obj);
                    if(objValue > length) {
                        throw new RuntimeException("Field " + f.getName() + " more than " + length);
                    }
                }

                if(a instanceof NotNull) {
                    Object objValue = f.get(obj);
                        if(objValue == null) {
                            throw new RuntimeException("Field " + f.getName() + " is null");
                        }
                }

                if(a instanceof NotEmpty) {
                    Object objValue = f.get(obj);
                    if(objValue instanceof Collection) {
                        boolean empty = ((Collection) objValue).isEmpty();
                        if(empty) {
                            throw new RuntimeException("dsfsdf");
                        }
                    }
                }
            }
        }
        return true;
    }
}


