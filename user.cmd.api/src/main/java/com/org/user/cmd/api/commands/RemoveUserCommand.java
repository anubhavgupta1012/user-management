package com.org.user.cmd.api.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RemoveUserCommand {
    @TargetAggregateIdentifier
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
