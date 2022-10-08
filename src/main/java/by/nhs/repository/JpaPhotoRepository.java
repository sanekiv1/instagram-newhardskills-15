package by.nhs.repository;

import by.nhs.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaPhotoRepository extends JpaRepository<Photo,Integer> {

}
