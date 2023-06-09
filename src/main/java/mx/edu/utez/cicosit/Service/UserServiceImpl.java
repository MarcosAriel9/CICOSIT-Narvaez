package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.User;
import mx.edu.utez.cicosit.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepository;

    @Override

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override

    public User save(User user) {
        return userRepository.save(user);
    }

    @Override

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }


}
