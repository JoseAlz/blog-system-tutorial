package pl.stefanprogramuje.blog.services;

import org.springframework.stereotype.Service;

@Service
public class UserServiceStubImpl implements UserService {

    @Override
    public boolean authenticate(String username, String password) {
        return username.equals(password);
    }
}
