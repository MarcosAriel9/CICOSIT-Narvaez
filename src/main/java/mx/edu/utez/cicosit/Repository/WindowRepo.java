package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindowRepo extends JpaRepository<Window, Long> {
}
