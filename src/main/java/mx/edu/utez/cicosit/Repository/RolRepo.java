package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepo extends JpaRepository<Rol, Long> {
}
