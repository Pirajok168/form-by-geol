package data.util;

import draw.litho.drawables.ILithoDrawable;
import lombok.SneakyThrows;

import javax.persistence.Converter;
import javax.persistence.AttributeConverter;

@Converter
public class LithoCardClassTypeConverter implements AttributeConverter<Class<? extends ILithoDrawable>, String> {

    @Override
    public String convertToDatabaseColumn(Class<? extends ILithoDrawable> anILithoDrawable) {
        return anILithoDrawable.getTypeName();
    }

    @SneakyThrows
    @Override
    public Class<? extends ILithoDrawable> convertToEntityAttribute(String string) {
        return (Class<? extends ILithoDrawable>) Class.forName(string);
    }
}
