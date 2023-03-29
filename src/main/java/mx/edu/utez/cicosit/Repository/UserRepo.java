package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
