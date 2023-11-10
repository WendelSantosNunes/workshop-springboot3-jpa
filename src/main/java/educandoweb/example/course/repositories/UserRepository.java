package educandoweb.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educandoweb.example.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
