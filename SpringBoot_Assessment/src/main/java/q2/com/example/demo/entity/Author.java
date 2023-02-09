/**
 * 
 */
package q2.com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author : Edward Lam
 * @date   : 2023-02-10
 */

@Entity
@Table(name = "authors")
public class Author {
	
	private long id;
	private String authorName;
	private String authorAddress;
	private String authorPhone;

	public Author() {

	}

	public Author(String authorName, String authorAddress, String authorPhone) {
		this.authorName = authorName;
		this.authorAddress = authorAddress;
		this.authorPhone = authorPhone;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return authorName;
	}

	public void setFirstName(String authorNamee) {
		this.authorName = authorNamee;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return authorAddress;
	}

	public void setLastName(String authorAddress) {
		this.authorAddress = authorAddress;
	}

	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return authorPhone;
	}

	public void setEmailId(String authorPhone) {
		this.authorPhone = authorPhone;
	}

}
