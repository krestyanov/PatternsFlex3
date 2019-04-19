package com.behavioral.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        TestChat chat = new TestChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat,"User 1");
        User user2 = new SimpleUser(chat,"User 2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello i am user 1");
        admin.sendMessage("i am admin");
    }
}
