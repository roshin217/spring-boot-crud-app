package ru.roshcheen.springbootcrudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.roshcheen.springbootcrudapp.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
