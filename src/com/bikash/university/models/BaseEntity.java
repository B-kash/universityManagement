package com.bikash.university.models;

import java.util.UUID;

public class BaseEntity {
    protected UUID id;

//    TODO: later on add more base entities like createdAt, updatedAt and so on.
    public BaseEntity() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }
}
