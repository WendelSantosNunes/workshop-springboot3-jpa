package educandoweb.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educandoweb.example.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
