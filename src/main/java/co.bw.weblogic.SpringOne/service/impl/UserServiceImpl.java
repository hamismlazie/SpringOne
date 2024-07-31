package co.bw.weblogic.SpringOne.service.impl;

import co.bw.weblogic.SpringOne.model.User;
import co.bw.weblogic.SpringOne.repository.UserRepository;
import co.bw.weblogic.SpringOne.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class   UserServiceImpl implements UserService {
    @Autowired
   private UserRepository userRepository;

    public User save(User user){
        return userRepository.save (user);

    }
    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }
    @Override
    public void deleteById(UUID id) {
        userRepository.deleteById(id);
    }

}
