package user.core.events;

import user.core.model.User;

public class UserUpdateEvent {
    private String id;
    private User user;

    public String getId() {
        return id;
    }

    public UserUpdateEvent setId(String id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserUpdateEvent setUser(User user) {
        this.user = user;
        return this;
    }
}