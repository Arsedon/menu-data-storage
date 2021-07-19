package ru.course.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.course.model.FoodRequest;
import ru.course.model.FoodResponse;
import ru.course.utils.StatusUtil;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @CrossOrigin
    @PostMapping(value = "/response", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<FoodResponse> greeting(@ModelAttribute FoodRequest request) {
        FoodResponse response = new FoodResponse();
        response.setClientName(request.getName());
        response.setClientPhoneNumber(request.getPhoneNumber());

        try {
            response.setStatus(StatusUtil.createSuccessStatus());
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        } catch (Exception e) {
            response.setStatus(StatusUtil.createFailedStatus());
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
    }
}
