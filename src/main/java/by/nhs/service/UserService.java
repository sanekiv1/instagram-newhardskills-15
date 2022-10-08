package by.nhs.service;

import by.nhs.entity.User;
import by.nhs.repository.JpaUserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    public void save(User user) {

        jpaUserRepository.save(user);

    }

    public User findByUsername(String username) {
        return jpaUserRepository.findByUsername(username).orElse(null);
    }

}
