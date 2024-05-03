package com.example.flashcardmobile.repositories;

import com.example.flashcardmobile.model.User;

import java.util.ArrayList;

public class UserRepository {
    public static ArrayList<User> getAllUser(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("001", "Đức Nguyên", "student"));
        list.add(new User("002", "Nhật Kha", "student"));
        list.add(new User("003", "Minh Quang", "student"));
        list.add(new User("004", "Johny Nguyễn", "student"));
        list.add(new User("005", "Chibi Yến", "student"));
        return list;
    }

    public static User getUser(String id){
        return new User(id, "Random Student", "student");
    }


}
