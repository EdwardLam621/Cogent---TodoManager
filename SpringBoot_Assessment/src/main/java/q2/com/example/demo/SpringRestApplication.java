/**
 * 
 */
package q2.com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.annotation.PostConstruct;
import q2.com.example.demo.entity.User;
import q2.com.example.demo.repository.UserRepository;

/**
 * @author : Edward Lam
 * @date   : 2023-02-10
 */
@SpringBootApplication
public class SpringRestApplication {
	
	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(102, "user1", "pwd1"), 
				new User(103, "user2", "pwd2"),
				new User(104, "user3", "pwd3")).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
