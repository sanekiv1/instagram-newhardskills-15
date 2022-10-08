package by.nhs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
//@Component
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class Post {
//    @Id
//    private int id;
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
//    private List<Photo> photoList = new java.util.ArrayList<>();
//
//    private int likes;
//   @OneToMany
//    private List<Comment> comments;
//
//    private String title;
//
//    private LocalDateTime createDate;
//
//    public List<Photo> getPhotoList() {
//        return photoList;
//    }
//
//    public void setPhotoList(List<Photo> photoList) {
//        this.photoList = photoList;
//    }
//}
