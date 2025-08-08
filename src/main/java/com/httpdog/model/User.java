package com.httpdog.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SavedList> savedLists = new ArrayList<>();

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SavedList> getSavedLists() {
        return savedLists;
    }

    public void setSavedLists(List<SavedList> savedLists) {
        this.savedLists = savedLists;
    }

	/**
	 * @param id
	 * @param email
	 * @param password
	 * @param savedLists
	 */
	public User(Long id, String email, String password, List<SavedList> savedLists) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.savedLists = savedLists;
	}
    public User() {
		// TODO Auto-generated constructor stub
	} 
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	 return "User{" +
         "id=" + id +
         ", email='" + email + '\'' +
         ", password='" + password + '\'' +
         ", savedLists=" + savedLists +
         '}';
    }
} 