package ru.course.model;

import lombok.Data;

@Data
public class Menu {

    private String imgPath;
    private String altImpName;
    private String title;
    private String description;
    private Integer price;
}
