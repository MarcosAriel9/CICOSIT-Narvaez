package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.User;

import java.util.Optional;

public interface UserService {
    public Iterable<User> findAll();
    public Optional<User> findById(Long id);
    public User save(User user);
    public void deleteById(Long id);
}
