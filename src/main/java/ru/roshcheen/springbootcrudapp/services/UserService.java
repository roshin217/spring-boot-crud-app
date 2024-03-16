package ru.roshcheen.springbootcrudapp.services;

import ru.roshcheen.springbootcrudapp.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findById(Long id);
    User save(User user);
    void update(Long id, User user);
    void deleteById(Long id);
}
