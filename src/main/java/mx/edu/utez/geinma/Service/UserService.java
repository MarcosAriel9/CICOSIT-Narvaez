package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.User;

import java.util.Optional;

public interface UserService {
    public Iterable<User> findAll();
    public Optional<User> findById(Long id);
    public User save(User user);
    public void deleteById(Long id);
}
