/**
 * 
 */
package q2.com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import q2.com.example.demo.entity.AuthRequest;
import q2.com.example.demo.entity.Author;
import q2.com.example.demo.service.AuthorService;
import q2.com.example.demo.util.JwtUtil;

/**
 * @author : Edward Lam
 * @date   : 2023-02-10
 */

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService as;
	
	@Autowired
	private JwtUtil jwtUtil;

	
	private AuthenticationManager authenticationManager;
	
	 @GetMapping("/")
	    public String welcome() {
	        return "please go to localhost:8080/login to login and read/manipulate author database";
	    }
	
	
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
	
	//Get All items	
	@GetMapping(value= {"/authors"})
	public List<Author> getAll(){
		List<Author> items = as.getAll();
		System.out.println("Book retrieved "+items.size());
		return items;
	}
	//Get an item
	@GetMapping("/authors/{id}")
	public Author get(@PathVariable("id") Integer id) {
		Optional<Author> i = as.get(id);
		return i.get();
	}
	//Insert an item
	@PostMapping("/authors")
	public Author add(@RequestBody Author item) {
		return as.update(item);
	}
	//Update an item
	@PutMapping("/authors")
	public Author edit(@RequestBody Author item) {
		return as.update(item);
	}
	//Delete an item
	@DeleteMapping("/authors")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Author> i = as.get(id);
		as.delete(i.get());
		return "Book id "+id+" deleted successfully";
	}
	

	

}
