package com.httpdog.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "saved_lists")
public class SavedList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "savedList", cascade = CascadeType.ALL)
    private List<ListItem> items = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ListItem> getItems() {
        return items;
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }

	
	public SavedList(Long id, String name, LocalDateTime createdAt, User user, List<ListItem> items) {
		super();
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.user = user;
		this.items = items;
	}
    public SavedList() {
		
	}
    @Override
    public String toString() {
    	
    	 return "SavedList{" +
    	            "id=" + id +
    	            ", name='" + name + '\'' +
    	            ", createdAt=" + createdAt +
    	            ", user=" + user +
    	            ", items=" + items +
    	            '}';
    }
} 