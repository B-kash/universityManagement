package com.bikash.university.services;

import com.bikash.university.models.BaseEntity;

import java.util.*;

public abstract class CrudService<T extends BaseEntity> {
    private Map<UUID, T> store = new HashMap<>();

    public T create(T value) {
        return store.put(value.getId(), value);
    }

    public T remove(UUID key) {
        return store.remove(key);
    }

    public T remove(T value) {
        return store.remove(value.getId());
    }

    public T update(T value) {
        return store.put(value.getId(), value);
    }

    public T retrieve(UUID key) {
        return store.get(key);
    }

    public List<T> retrieveAll() {
        return (List<T>) store.values();
    }
}
