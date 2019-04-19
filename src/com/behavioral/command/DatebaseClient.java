package com.behavioral.command;

public class DatebaseClient {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertVideo();
        developer.selectVideo();
        developer.updateVideo();
        developer.deleteVideo();

    }
}
