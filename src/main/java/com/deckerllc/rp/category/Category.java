package com.deckerllc.rp.category;

import com.deckerllc.rp.core.BaseEntity;
import com.deckerllc.rp.review.Review;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by molayodecker on 19/10/2017.
 */
@Entity
public class Category extends BaseEntity implements Serializable {
    private String title;
    private String url;
    @OneToMany
    private List<Review> review;

    public Category(String title, String url) {
        this.title = title;
        this.url = url;
    }

    protected Category(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Review> getReview() {
        return review;
    }

    public void add(Review review) {
        review.setCategory(this);
        this.review.add(review);
    }

    @Override
    public String toString() {
        return "Category{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
