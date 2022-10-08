package by.nhs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;


//    @ManyToOne
//    @JoinColumn(name = "post_id")
//    private Post post;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }
}