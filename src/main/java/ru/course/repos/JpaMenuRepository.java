package ru.course.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.course.model.jpa.JpaMenu;

@Repository
public interface JpaMenuRepository extends JpaRepository<JpaMenu, Long> {
}
