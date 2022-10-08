package by.nhs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;



    private String username;

    private String password;

    private String name;

    private String address;

    private String email;

    private String phoneNumber;
//    @OneToMany
//    private List<Post> posts;
//    @OneToMany
//    private List<User> subscribers;
//    @OneToMany
//    private List<User> followers;
//



}
