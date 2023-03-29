package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepo extends JpaRepository<Rol, Long> {
}
