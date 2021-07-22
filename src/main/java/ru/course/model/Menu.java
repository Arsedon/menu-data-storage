package ru.course.model;

import lombok.Data;

@Data
public class Menu {

    private String img;
    private String altImg;
    private String title;
    private String description;
    private Integer price;
}
