package com.deckerllc.rp.core;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

/**
 * Created by molayodecker on 19/10/2017.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    protected BaseEntity() {
        id = null;
    }
}
