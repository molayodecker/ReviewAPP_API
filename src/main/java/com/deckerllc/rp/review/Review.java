package com.deckerllc.rp.review;

import com.deckerllc.rp.category.Category;
import com.deckerllc.rp.core.BaseEntity;
import com.deckerllc.rp.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by molayodecker on 19/10/2017.
 */
@Entity
public class Review extends BaseEntity implements Serializable {
    private int rating;
    private String description;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User userreviewer;

    public Review(int rating, String description, Category category, User userreviewer) {
        this.rating = rating;
        this.description = description;
        this.category = category;
        this.userreviewer = userreviewer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUserreviewer() {
        return userreviewer;
    }

    public void setUserreviewr(User userreviewer) {
        this.userreviewer = userreviewer;
    }
}
