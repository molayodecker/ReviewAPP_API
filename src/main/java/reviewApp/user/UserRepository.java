package reviewApp.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by molayodecker on 16/10/2017.
 */
@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
