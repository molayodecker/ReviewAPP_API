package reviewApp.category;

import reviewApp.core.BaseEntity;
import reviewApp.review.Review;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by molayodecker on 16/10/2017.
 */
public class Category extends BaseEntity {
        private CategoryList title;
        private String url;
        @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
        private List<Review> reviews;




    public CategoryList getTitle() {
        return title;
    }

    public void setTitle(CategoryList title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void add(Review reviews) {
       reviews.setCategory(this);
    }
}
