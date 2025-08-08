package com.httpdog.model;
import javax.persistence.*;


@Entity
@Table(name = "list_items")
public class ListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "list_id", nullable = false)
    private SavedList savedList;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    

    
	public ListItem(Long id, String code, String imageUrl, SavedList savedList) {
		super();
		this.id = id;
		this.code = code;
		this.imageUrl = imageUrl;
		this.savedList = savedList;
	}


	public ListItem() {
		
	}
	public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SavedList getSavedList() {
        return savedList;
    }

    public void setSavedList(SavedList savedList) {
        this.savedList = savedList;
    }
    @Override
    public String toString() {
    	 return "ListItem{" +
    	            "id=" + id +
    	            ", code='" + code + '\'' +
    	            ", imageUrl='" + imageUrl + '\'' +
    	            ", savedList=" + savedList +
    	            '}';
    }
} 