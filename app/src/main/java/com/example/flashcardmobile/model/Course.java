package com.example.flashcardmobile.model;

import java.util.ArrayList;

public class Course {
    private String id;
    private String name;

    private ArrayList<User> listMember;
    private ArrayList<CardSet> listCardSet;
    private User teacher;

    public Course() {}

    public Course(String id, String name, ArrayList<User> listMember, ArrayList<CardSet> listCardSet, User teacher) {
        this.id = id;
        this.name = name;
        this.listMember = listMember;
        this.listCardSet = listCardSet;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getListMember() {
        return listMember;
    }

    public void setListMember(ArrayList<User> listMember) {
        this.listMember = listMember;
    }

    public ArrayList<CardSet> getListCardSet() {
        return listCardSet;
    }

    public void setListCardSet(ArrayList<CardSet> listCardSet) {
        this.listCardSet = listCardSet;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
