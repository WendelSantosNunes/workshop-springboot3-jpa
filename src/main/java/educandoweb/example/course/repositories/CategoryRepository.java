package educandoweb.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educandoweb.example.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
