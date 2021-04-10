package user.core.events;

import user.core.model.User;

public class UserRemoveEvent {
    private String id;
    private User user;

    public String getId() {
        return id;
    }

    public UserRemoveEvent setId(String id) {
        this.id = id;
        return this;
    }
}

