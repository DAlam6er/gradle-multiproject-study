package com.dmdev.dto;

import java.util.Objects;

public final class UserDto {
    private final Integer id;
    private final String name;

    private UserDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static UserDtoBuilder builder() {
        return new UserDtoBuilder();
    }

    @Override
    public String toString() {
        return "UserDto(id=" + this.id + " , name=" + this.name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserDto other)) {
            return false;
        }

        if (id == null ? other.getId() != null : !id.equals(other.getId())) {
            return false;
        }
        return name == null ? other.getName() == null : name.equals(other.getName());
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static class UserDtoBuilder {
        private Integer id;
        private String name;

        private UserDtoBuilder() {
        }

        public UserDtoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public UserDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserDto build() {
            return new UserDto(id, name);
        }
    }
}
