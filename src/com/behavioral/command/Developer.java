package com.behavioral.command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertVideo(){
        insert.execute();
    }

    public void updateVideo(){
        update.execute();
    }

    public void selectVideo(){
        select.execute();

    }

    public void deleteVideo(){
        delete.execute();
    }



}

