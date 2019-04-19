package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TestChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String message, User user){
        for(User u: users){
            if(u!=user){
               u.getMessage(message);
            }
        }
        admin.getMessage(message);

    }



}
