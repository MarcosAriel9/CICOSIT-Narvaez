package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {
}
