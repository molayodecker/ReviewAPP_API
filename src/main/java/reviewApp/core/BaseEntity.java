package reviewApp.core;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

/**
 * Created by molayodecker on 16/10/2017.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private final Long id;
   private Long version;

    protected BaseEntity() {
        id = null;
    }
}
