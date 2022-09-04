package com.github.maksimdenisov.menuplanner.dao;


import com.github.maksimdenisov.menuplanner.model.security.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Admin","admin@mail.com"));
        userList.add(new User("User","user@mail.com"));
        return userList;
    }
}
