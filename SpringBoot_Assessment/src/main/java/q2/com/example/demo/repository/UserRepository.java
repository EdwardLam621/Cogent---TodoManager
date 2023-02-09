package q2.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import q2.com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}