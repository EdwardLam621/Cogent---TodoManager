/**
 * 
 */
package q2.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import q2.com.example.demo.entity.Author;

/**
 * @author : Edward Lam
 * @date   : 2023-02-10
 */
@Repository
public interface AuthorRepository  extends JpaRepository<Author, Long>{

}
