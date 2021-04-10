package com.org.user.cmd.api.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import user.core.model.User;

public class RegisterUserCommand {
    @TargetAggregateIdentifier
    private String id;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
