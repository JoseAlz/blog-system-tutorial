package pl.stefanprogramuje.blog.services;

public interface UserService {
    boolean authenticate(String username, String password);
}
