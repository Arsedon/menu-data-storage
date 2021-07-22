package ru.course.converter;

import org.springframework.stereotype.Component;
import ru.course.model.Menu;
import ru.course.model.jpa.JpaMenu;

@Component
public class JpaMenuConverter implements AbstractConverter<Menu, JpaMenu> {

    @Override
    public Menu convert(JpaMenu source) {
        Menu menu = new Menu();
        menu.setImg(source.getImgPath());
        menu.setAltImg(source.getAltImpName());
        menu.setDescription(source.getDescription());
        menu.setPrice(source.getPrice());
        menu.setTitle(source.getTitle());
        return menu;
    }
}
