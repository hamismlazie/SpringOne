package co.bw.weblogic.SpringOne.service;

import co.bw.weblogic.SpringOne.model.User;

import java.util.List;
import java.util.UUID;

//used for services
public interface UserService {

      List<User> findAll();
    User findByUsername(String username);
    User findById(UUID id);
    void deleteById(UUID id);
    User save(User user);
}
