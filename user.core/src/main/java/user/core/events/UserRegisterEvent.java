package user.core.events;

import user.core.model.User;

public class UserRegisterEvent {
    private String id;
    private User user;

    public String getId() {
        return id;
    }

    public UserRegisterEvent setId(String id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserRegisterEvent setUser(User user) {
        this.user = user;
        return this;
    }
}
