package com.example.flashcardmobile.repositories;

import com.example.flashcardmobile.model.CardSet;
import com.example.flashcardmobile.model.Course;
import com.example.flashcardmobile.model.User;

import java.util.ArrayList;

public class CourseRepository {
    public static ArrayList<Course> getAllCourses(){
        ArrayList<Course> listCourses = new ArrayList<>();
        ArrayList<User> listMember = UserRepository.getAllUser();
        ArrayList<CardSet> listCardSet = CardSetRepository.getAllCardSet();
        listCourses.add(new Course("001",
                "Lớp đột phá TOEIC 800+",
                listMember,
                listCardSet,
                new User("001", "Koro-sensei", "teacher") ));
        listCourses.add(new Course("002",
                "Lớp giải ngố tiếng Anh",
                listMember,
                listCardSet,
                new User("002", "Nguyễn Ngọc Mai", "teacher") ));
        listCourses.add(new Course("003",
                "Lớp Tiếng Anh IT",
                listMember,
                listCardSet,
                new User("003", "Nguyễn Thuận", "teacher") ));
        listCourses.add(new Course("004",
                "Lớp thầy Hiếu",
                listMember,
                listCardSet,
                new User("004", "Hiếu Mondey", "teacher") ));
        return listCourses;
    }

    public static Course getCourse(String id){
        ArrayList<User> listMember = UserRepository.getAllUser();
        ArrayList<CardSet> listCardSet = CardSetRepository.getAllCardSet();
        switch(id){
            case "001":
                return new Course("001",
                        "Lớp đột phá TOEIC 800+",
                        listMember,
                        listCardSet,
                        new User("001", "Koro-sensei", "teacher") );
            case "002":
                return new Course("002",
                        "Lớp giải ngố tiếng Anh",
                        listMember,
                        listCardSet,
                        new User("002", "Nguyễn Ngọc Mai", "teacher") );
            case "003":
                return new Course("003",
                        "Lớp Tiếng Anh IT",
                        listMember,
                        listCardSet,
                        new User("003", "Nguyễn Thuận", "teacher") );
            case "004":
                return new Course("004",
                        "Lớp thầy Hiếu",
                        listMember,
                        listCardSet,
                        new User("004", "Hiếu Mondey", "teacher") );
            default:
                return null;
        }
    }
}
