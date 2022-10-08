package by.nhs.repository;

import by.nhs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

}
