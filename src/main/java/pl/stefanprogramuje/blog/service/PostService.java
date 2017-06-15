package pl.stefanprogramuje.blog.service;

import pl.stefanprogramuje.blog.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
