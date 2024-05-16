package com.dmdev.model;

public record User(Integer id, String name) {
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        Integer id;
        String name;

        public Builder() {
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(id, name);
        }
    }
}
