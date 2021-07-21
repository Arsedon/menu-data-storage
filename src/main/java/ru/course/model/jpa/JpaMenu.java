package ru.course.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Table(name = "menu")
@Entity
public class JpaMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imgPath;
    private String altImpName;
    private String title;
    private String description;
    private Integer price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JpaMenu jpaMenu = (JpaMenu) o;
        return Objects.equals(id, jpaMenu.id) &&
                Objects.equals(imgPath, jpaMenu.imgPath) &&
                Objects.equals(altImpName, jpaMenu.altImpName) &&
                Objects.equals(title, jpaMenu.title) &&
                Objects.equals(description, jpaMenu.description) &&
                Objects.equals(price, jpaMenu.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imgPath, altImpName, title, description, price);
    }
}
