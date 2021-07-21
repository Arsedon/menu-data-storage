package ru.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.course.converter.JpaMenuConverter;
import ru.course.model.Menu;
import ru.course.repos.JpaMenuRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MenuService {

    @Autowired
    JpaMenuRepository repository;
    @Autowired
    JpaMenuConverter converter;

    public List<Menu> getAllMenus(){
        return repository.findAll().stream()
                .map(jpaMenu -> converter.convert(jpaMenu))
                .collect(Collectors.toList());
    }
}
