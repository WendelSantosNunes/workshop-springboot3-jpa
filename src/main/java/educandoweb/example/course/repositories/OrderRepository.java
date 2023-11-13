package educandoweb.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educandoweb.example.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
