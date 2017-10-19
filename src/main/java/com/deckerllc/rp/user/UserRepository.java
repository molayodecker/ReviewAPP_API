package com.deckerllc.rp.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by molayodecker on 19/10/2017.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
