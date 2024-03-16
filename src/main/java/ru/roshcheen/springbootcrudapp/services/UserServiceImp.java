package ru.roshcheen.springbootcrudapp.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.roshcheen.springbootcrudapp.models.User;
import ru.roshcheen.springbootcrudapp.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Transactional
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User user) {
        User userToBeUpdated = findById(id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setAge(user.getAge());
        userRepository.save(userToBeUpdated);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
