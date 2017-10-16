package reviewApp.category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by molayodecker on 16/10/2017.
 */
public interface CategoryRepository extends JpaRepository<Category,Long>{
    Page<Category> findByTitleContaining(@Param("title") String title, Pageable Page);
}
