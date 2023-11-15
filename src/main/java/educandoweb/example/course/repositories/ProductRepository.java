package educandoweb.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educandoweb.example.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
