/**
 * 
 */
package q2.com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import q2.com.example.demo.entity.Author;
import q2.com.example.demo.repository.AuthorRepository;


/**
 * @author : Edward Lam
 * @date   : 2023-02-10
 */
@Service
public class AuthorService {
  @Autowired
  AuthorRepository itr;
  
  //Single Item get
  public Optional<Author> get(long bookId){
	  return itr.findById(bookId);
  }
  //Get all items
  public List<Author> getAll(){
	  return (List<Author>) itr.findAll();
  }
  //Update/create item
  public Author update(Author book) {
	  return itr.save(book);
  }
  //Delete item
  public void delete(Author book) {
	  itr.delete(book);
  }
  //Delete all items
  public void deleteAll() {
	  itr.deleteAll();
  }
}
