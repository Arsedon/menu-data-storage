package ru.course.converter;

public interface AbstractConverter<T, D> {

    T convert(D source);
}
