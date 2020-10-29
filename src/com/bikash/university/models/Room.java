package com.bikash.university.models;

import java.util.Objects;

public class Room extends BaseEntity {
    private Integer capacity;
    private String name;

    public Room() {
        super();
    }

    public Room(Integer capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return room.getId().equals(this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name,capacity);
    }

    @Override
    public String toString() {
        return "Room{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
