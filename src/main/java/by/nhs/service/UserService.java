package by.nhs.service;

import by.nhs.entity.Photo;
import by.nhs.entity.User;
import by.nhs.repository.JpaPhotoRepository;
import by.nhs.repository.JpaUserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private JpaUserRepository jpaUserRepository;
    @Autowired
    private JpaPhotoRepository jpaPhotoRepository;

    public void save(User user) {

        jpaUserRepository.save(user);

    }
    public void save(Photo photo) {

        jpaPhotoRepository.save(photo);

    }

    public User findByUsername(String username) {
        return jpaUserRepository.findByUsername(username).orElse(null);
    }

}
