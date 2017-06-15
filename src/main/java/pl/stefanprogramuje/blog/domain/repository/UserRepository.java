package pl.stefanprogramuje.blog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.stefanprogramuje.blog.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
