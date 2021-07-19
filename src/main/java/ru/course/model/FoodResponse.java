package ru.course.model;

import lombok.Data;

@Data
public class FoodResponse {

    private Status status;
    private String clientName;
    private String clientPhoneNumber;

}
