package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindowRepo extends JpaRepository<Window, Long> {
}
