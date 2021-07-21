package ru.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.course.model.FoodRequest;
import ru.course.model.FoodResponse;
import ru.course.model.Menu;
import ru.course.model.jpa.JpaMenu;
import ru.course.service.MenuService;
import ru.course.utils.StatusUtil;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    MenuService menuService;

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

    @CrossOrigin
    @GetMapping(value = "/menu", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Menu>> getMenu(){
        List<Menu> allMenus = menuService.getAllMenus();
        return new ResponseEntity<>(allMenus, HttpStatus.CREATED);
    }
}
