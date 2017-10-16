package reviewApp.review;

import reviewApp.category.Category;
import reviewApp.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by molayodecker on 16/10/2017.
 */
@Entity
public class Review {
    private String description;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User Reviewer;

    protected Review(){
        super();
    }

    public Review(String description, Category category, User reviewer) {
        this.description = description;
        this.category = category;
        Reviewer = reviewer;
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

    public User getReviewer() {
        return Reviewer;
    }

    public void setReviewer(User reviewer) {
        Reviewer = reviewer;
    }
}